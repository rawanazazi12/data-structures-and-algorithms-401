package linkedList;

import org.jetbrains.annotations.NotNull;

public class LinkedList {
  public LinkedListNode head;
  public int size;

  public LinkedList(){
  }

  public void insert (String data){

      if(head==null){
          LinkedListNode node=new LinkedListNode(data);
          head =node;
          size++;
      }else{
          LinkedListNode current ;
          current= head;
         while (current.getNext()!= null){
            current=current.getNext();
          }
          LinkedListNode node = new LinkedListNode(data);
          current.setNext(node);
          size++;

      }

  }

  public boolean isIncluded(String data){
      LinkedListNode node=head;
      while(node!= null){
          if (node.getData()== data){
              return true;
          }
          node=node.getNext();
      }
      return false;
  }

    public String toString(){
      String linkedListData="";
      LinkedListNode node= head;
      while (node!=null){
          linkedListData+= "{";
          linkedListData+=node.getData();
          linkedListData+="}";
          linkedListData+=" => ";
          node=node.getNext();
      }
        linkedListData+="NULL";
        return  linkedListData;
      }

      public void addNewNodeAtEnd(String data){
      LinkedListNode node =new LinkedListNode(data);
      if (head == null){
          head =node;
      }else {
          LinkedListNode last= head;
          while(last.getNext()!=null){
              last=last.getNext();
          }
          last.setNext(node);
      }
      size++;
      }

      public void insertBefore(String referenceNodeData,String newNodeData ){
          LinkedListNode newNode =new LinkedListNode(newNodeData);
          if (head == null){
              head=newNode;
          }else if(head.getData()==referenceNodeData){
              newNode.setNext(head);
              head =newNode;
              }else if(isIncluded(referenceNodeData)==false){
              System.out.println("The reference node you entered is not exist");
          } else {
              LinkedListNode temp=head;
              while(temp.getNext().getData() != referenceNodeData){
                  temp=temp.getNext();
              }
              newNode.setNext(temp.getNext());
              temp.setNext(newNode) ;
          }
          size++;
          }

          public void insertAfter(String referenceNodeData,String newNodeData){
          LinkedListNode newNode= new LinkedListNode(newNodeData);
              if (head == null){
                  head=newNode;
              }else if(isIncluded(referenceNodeData)==false){
                  System.out.println("The reference node you entered is not exist");
              }else  {
                  LinkedListNode temp=head;
                  while(temp.getData()!= referenceNodeData){
                      temp=temp.getNext();
                  }

                  newNode.setNext(temp.getNext());
                  temp.setNext(newNode) ;

              }
              size++;
          }

          // challenge 07

          public String kthFromEnd(int k){
           int counter=0;
           LinkedListNode current= head;

              try {

                  while (current!=null){
                      current=current.getNext();
                      counter++ ;

                  }
                  int index= counter - k - 1;
                  current = head;
                  for (int i=0; i<index;i++){
                      current=current.getNext();
                      if ( k < 0 && counter!=1 ) {
                          throw new IndexOutOfBoundsException("k value out of boundaries");
                      }

                  }if(k > counter - 1 && counter!=1){
                      throw new IndexOutOfBoundsException("k value out of boundaries");
                  }else if (counter ==1 ){
                      return "The Linked List size is 1";
                  }

              } catch (IndexOutOfBoundsException e){
                  return e.getMessage();
              }

              return current.getData() ;

          }

          // Challenge08
    public LinkedList zipLists(@NotNull LinkedList x , LinkedList y){
        LinkedList mergedList= new LinkedList();
            if (x.head == null && y.head == null) {
                System.out.println("The two lists are empty");

            } else if (y.head == null) {
                System.out.println("The second list is empty, here is The first list : ");
                mergedList = x;
                return mergedList;
            } else if (x.head == null) {
                System.out.println("The first list is empty, here is The second list : ");
                mergedList = y;
                return mergedList;
            }else {
                LinkedListNode currentX = x.head;
                LinkedListNode currentY = y.head;
                while (currentX.getNext() != null && currentY.getNext() != null) {
                    mergedList.insert(currentX.getData());
                    mergedList.insert(currentY.getData());
                    currentX = currentX.getNext();
                    currentY = currentY.getNext();
                }
                mergedList.insert(currentX.getData());
                mergedList.insert(currentY.getData());

                if (currentX.getNext() != null) {
                    while (currentX.getNext() != null) {
                        currentX = currentX.getNext();
                        mergedList.insert(currentX.getData());
                    }
                } else if (currentY.getNext() != null) {
                    while (currentY.getNext() != null) {
                        currentY = currentY.getNext();
                        mergedList.insert(currentY.getData());
                    }
                }
            }

       return mergedList;
    }


}









