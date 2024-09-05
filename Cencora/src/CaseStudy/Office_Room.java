package CaseStudy;
class RoomNotFound extends Exception{
    String msg;
    public RoomNotFound(String msg){
        super(msg);
    }
    public static void RoomCheck(int A) throws RoomNotFound {
        if(A-60!=0){
            throw new RoomNotFound("Room not available wait");
        }else{
            System.out.println("Allocate the room");
        }
    }

}
public class Office_Room {
    public static void main(String[] args) throws RoomNotFound {
        try{
            RoomNotFound.RoomCheck(61);
        }catch (RoomNotFound e){
            System.out.println(e);
        }
    }
}
