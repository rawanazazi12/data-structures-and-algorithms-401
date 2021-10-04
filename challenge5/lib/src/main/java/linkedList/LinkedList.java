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


      }





