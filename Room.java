class Room{
    int length;
    int width;
    Room(int x, int y){
        length=x;
        width=y;
    }
    Room(int x){
        length=width=x;
    }
    int area(){
        return (length*width);
    }
}
class RoomArea{
    public static void main(String[] args) {
        Room room1=new Room(10,20);
        Room room2=new Room(10);
        int area1=room1.area();
        int area2=room2.area();
        System.out.println("Area1="+area1);
         System.out.println("Area1="+area2);

    }
}