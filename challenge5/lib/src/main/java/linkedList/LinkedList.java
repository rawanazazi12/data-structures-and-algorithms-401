package linkedList;

public class LinkedList {
  private LinkedListNode head;
  private int size;

  public LinkedList(){
  }

  public void insert (String data){

      if(head==null){
          LinkedListNode node=new LinkedListNode(data);
          head =node;
          size++;
      }else{
          LinkedListNode current = null;
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


    }



