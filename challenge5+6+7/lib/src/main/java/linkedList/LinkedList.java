package linkedList;

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
        return "Linked List = " + linkedListData;
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

           while (current!=null){
               current=current.getNext();
               counter++ ;
           }

           int index= counter - k - 1;
           current = head;
           for (int i=0; i<index;i++){
               current=current.getNext();
           }
              try {
                  if (k > counter - 1 || k < 0) {
                      throw new IndexOutOfBoundsException("k value out of boundaries");
                  }

              } catch (IndexOutOfBoundsException e){
                  System.out.println(e.getMessage());
              }

              return current.getData() ;

          }
}









