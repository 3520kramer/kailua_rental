import java.sql.SQLException;
import java.util.Scanner;

public class KailuaMain {
    public static void main(String[] args) throws SQLException {

        accessKailuaDB db = new accessKailuaDB();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Press 1 - Insert car\nPress 2 - Delete car\nPress 3 - Update car\nPress 4 - View cars");
            int input = scan.nextInt();

            switch(input){
                case 1 :
                    //TODO insert car
                case 2 :
                    //TODO delete car
                case 3:
                    //TODO update car
                case 4 :
                    db.view();
            }
        }
    }
}
