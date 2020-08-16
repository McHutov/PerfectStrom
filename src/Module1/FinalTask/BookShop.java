package Module1.FinalTask;

import java.util.Scanner;

public class BookShop {
    private static String books[] = new String[50];

    private static Scanner s = new Scanner(System.in);
    private static Scanner s1 = new Scanner(System.in);

    private static int size = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String choice="";
        String pause;

        do {
            if(size < 50)
            {
                menu();

                choice = s.nextLine();
                action(choice);

                System.out.print("Enter any key to continue...");
                pause = s.nextLine();
            }
            else
            {
                System.out.println("BookShop is full!Try again");
            }
        } while (choice != "6");

    }

    private static void menu()
    {
        System.out.println("\t\tMenu");
        System.out.print("1.Add book\n" +
                "2.Delet book\n" +
                "3.Change the name of the book\n" +
                "4.Show all books\n" +
                "5.Look for a book\n" +
                "6.Close\n");
    }

    private static void addBook()
    {
        String title;
        int identifactor = 0;

        System.out.print("Please enter title of the book: ");
        title = s.nextLine();

        if(size != 0)
        {
            for(int i = 0; i < size; i++)
            {
                if(books[i].equals(title))
                {
                    identifactor++;
                }

            }
        }

        if(identifactor == 0)
        {
            books[size++] = title;
        }
        else
        {
            System.out.println("This book is already in the shop!");
        }
    }

    private static void deleteBook()
    {
        String title;
        int copy;

        System.out.print("Which book do u want to delete: ");
        title = s.nextLine();

        copy = size;
        for (int i = 0; i < size; i++)
        {
            if (books[i].equals(title))
            {
                for (int j = i; j < size - 1; j++)
                {
                    books[j] = books[j + 1];
                }
                System.out.println("Book was deleted");
                size--;
            }
        }
        if (copy == size)
        {
            System.out.println("There are no books with this title! Try again!");
        }
    }

    private static void changeTitle()
    {
        String title;
        int identifier = 0;

        System.out.print("Which book title do u want to change: ");
        title = s.nextLine();

        for (int i = 0; i < size; i++)
        {
            if (books[i].equals(title))
            {
                identifier = i + 1;
            }
        }

        if (identifier > 0)
        {
            System.out.print("Enter new title: ");
            String newtitle = s.nextLine();

            books[identifier - 1] = books[identifier - 1].replace(title, newtitle);
            System.out.println("Book title changed successfully");
        }
        else
        {
            System.out.println("This book does not exist, try again!");
        }
    }

    private static void showBooks()
    {
        System.out.println("\tList of you books");

        for (int i = 0; i < size; i++)
        {
            System.out.println(i + 1 + "." + books[i]);
        }
    }

    private static void bookSearch()
    {
        String title;
        int identifier1 = 0;

        System.out.print("What book are you looking for: ");
        title = s.nextLine();

        for(int i = 0; i < size; i++)
        {
            if(books[i].equals(title))
            {
                identifier1++;
            }
        }

        if(identifier1 > 0)
        {
            System.out.println("This book in the shop");
        }
        else
        {
            System.out.println("This book does not exist, try again!");
        }
    }

    private static void action(String choice)
    {
        String title;
        char answer;

        switch (choice)
        {
            case "1":
                do
                {
                    addBook();

                    System.out.println("Do u want to repeat steps again?Y/N");
                    answer = s1.nextLine().charAt(0);

                    if (answer == 'n' || answer == 'N')
                    {
                        break;
                    }
                    else
                    {
                        if (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n')
                        {
                            do
                            {
                                System.out.println("Please enter Y or N");
                                answer = s.nextLine().charAt(0);

                                if (answer == 'N' || answer == 'Y' || answer == 'n' || answer == 'y')
                                {
                                    break;
                                }
                            } while (answer != 'N' || answer != 'Y');
                        }
                    }
                } while (answer == 'Y' || answer == 'y');

                break;
            case "2":
                if(size > 0)
                {
                    do
                    {
                        deleteBook();

                        if(size == 0)
                        {
                            System.out.println("There are no books");
                            break;
                        }

                        System.out.println("Do u want to repeat steps again?Y/N");
                        answer = s1.nextLine().charAt(0);

                        if (answer == 'n' || answer == 'N')
                        {
                            break;
                        }
                        else
                        {
                            if (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n')
                            {
                                do
                                {
                                    System.out.println("Please enter Y or N");
                                    answer = s.nextLine().charAt(0);

                                    if (answer == 'N' || answer == 'Y' || answer == 'n' || answer == 'y' )
                                    {
                                        break;
                                    }
                                } while (answer != 'N' || answer != 'Y');
                            }
                        }
                    } while (size > 0 && (answer == 'Y' || answer == 'y'));
                }
                else
                {
                    System.out.println("You should add books to the shop!");
                }

                break;
            case "3":
                if(size > 0)
                {
                    do
                    {
                        changeTitle();

                        System.out.println("Do u want to repeat steps again?Y/N");
                        answer = s1.nextLine().charAt(0);

                        if(answer == 'n' || answer == 'N')
                        {
                            break;
                        }
                        else
                        {
                            if (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n')
                            {
                                do
                                {
                                    System.out.println("Please enter Y or N");
                                    answer = s.nextLine().charAt(0);
                                    if(answer == 'N' || answer == 'Y' || answer == 'n' || answer == 'y')
                                    {
                                        break;
                                    }
                                }while(answer != 'N' || answer != 'Y');
                            }
                        }
                    }while(answer == 'Y' || answer == 'y' );
                }
                else
                {
                    System.out.println("Firstly u should add books to bd!");
                }

                break;
            case "4":
                if(size > 0)
                {
                    showBooks();
                }
                else
                {
                    System.out.println("Firstly u should add books to bd!");
                }

                break;
            case "5":
                if(size > 0)
                {
                    bookSearch();
                }
                else
                {
                    System.out.println("Firstly u should add books to bd!");
                }

                break;
            case "6":
                System.exit(0);

                break;
            default:
                System.out.println("This command doesn't exist, try again" );

                break;
        }
    }
}
