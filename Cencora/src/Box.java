public class Box<T>{
    private T content;
     public void setContent(T content){

         this.content = content;
     }
     public <T> void printArray(T[] array){
         for(T element:array){
             System.out.println(element);
         }
     }
     public T getContent(){
         return content;
     }

     public static void main(String[] args){
         Box<Integer> integerBox = new Box<>();
         integerBox.setContent(123);
         System.out.println(integerBox.getContent());
         Box<String> sBox = new Box<>();
         sBox.setContent("hello");
         System.out.println(sBox.getContent());
         Box integer =new Box();
         Integer[] intArray={1,2};
         Box b = new Box();
         b.printArray(intArray);

     }

}
