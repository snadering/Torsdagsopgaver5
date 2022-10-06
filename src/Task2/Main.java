package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room bedroom = new Room(1,4,2);
        Room kitchen = new Room(1, 2, 3);
        Room livingRoom = new Room(2,6,4);

        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(bedroom);
        rooms.add(kitchen);
        rooms.add(livingRoom);


        Building skyscraper = new Building(rooms, 10, 2, true);
        System.out.println(countLampsInBuilding(skyscraper));
        System.out.println(isNormal(skyscraper));

    }

    public static int countLampsInBuilding(Building building){

       ArrayList<Room> rooms =  building.getRooms();
       int result = 0;

        for (int i = 0; i < rooms.size(); i++) {
            result += rooms.get(i).getNumberOfLamps();
        }
        return result;
    }

    public static boolean isNormal(Building building){

      int numsOfFloors = building.getNumberOfFloors();
      ArrayList<Room> rooms = building.getRooms();
      if(numsOfFloors > rooms.size()){
          return true;
      } else {

          System.out.println("This is an odd building");
          return false;
      }
    }


}
