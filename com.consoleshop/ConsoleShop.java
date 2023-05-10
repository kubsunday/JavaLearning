import java.util.Scanner;

public class ConsoleShop{
    public static void main(String[] args) {
        System.out.println("Hello my name is Mike welcome to electronics shop what is your name?");
        Scanner names = new Scanner(System.in);
        String name = names.nextLine();
            System.out.println("My name is " + name + ", I would like to buy a new console.");
                System.out.println("What brands do you have in stock?");
                System.out.println("We have:");
                    System.out.println("1)Xbox");
                    System.out.println("2)Playstation");
                    System.out.println("3)Nintendo");
                        Scanner brands = new Scanner(System.in);
                        int brand = brands.nextInt();
                            if(brand == 1){
                            
                                System.out.println("Good choice Microsoft has a grate stock of games, and as far as I know they still have gamepass.");
                                System.out.println("We have on stock: ");
                                System.out.println("1)Xbox Series S");
                                System.out.println("2)Xbox Series X");
                                System.out.println("3)Xbox One");
                                        Scanner xboxs = new Scanner(System.in);
                                        int xbox = xboxs.nextInt();
                                            if(xbox == 1){
                                                System.out.println("Here it is. It costs 500$.");
                                            }else if(xbox == 2){
                                                System.out.println("Here it is. It costs 400$.");
                                            }else if(xbox == 3){
                                                System.out.println("Here it is. It costs 250$.");
                                            }
                            }else if(brand == 2){
                                System.out.println("A little bit overprized, but they have a great complex of exlusives.");
                                System.out.println("We have on stock: ");
                                    System.out.println("1)Playstation 5");
                                    System.out.println("2)Playstation 5 PRO");
                                    System.out.println("3)Playstation 4 Pro");
                                    System.out.println("3)Playstation 4 ");
                                        Scanner playstations = new Scanner(System.in);
                                        int playstation = playstations.nextInt();
                                            if(playstation == 1){
                                                System.out.println("Here it is. It costs 500$.");
                                            }else if(playstation == 2){
                                                System.out.println("Here it is. It costs 400$.");
                                            }else if(playstation == 3){
                                                System.out.println("Here it is. It costs 250$.");
                                            }
                            }else if(brand == 3){
                                System.out.println("For now we only posses Nintendo Switch but it is still a great choice for gamer on the road.");
                                System.out.println("We have on stock: ");
                                    System.out.println("1)Nintendo Series S");
                                    System.out.println("2)Nintendo Series X");
                                    System.out.println("3)Nintendo One");
                                        Scanner nintendos = new Scanner(System.in);
                                        int nintendo = nintendos.nextInt();
                                            if (nintendo == 1){
                                                System.out.println("Here it is. It costs 500$.");
                                            }else if(nintendo == 2){
                                                System.out.println("Here it is. It costs 400$.");
                                            }else if(nintendo == 3){
                                                System.out.println("Here it is. It costs 250$.");
                                            }
                             }else{ 
                                System.out.println("I've changed my mind but thanks.");
                            }
                        }
                        
                    }
                        
                
                
                
                        

  
