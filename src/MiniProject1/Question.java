package MiniProject1;

import java.util.Arrays;
import java.util.Scanner;

public class Question {
  public static void main(String[] args) {
    // StringBuilder underscoreWordSpaces;
    // underscoreWordSpaces = initializeunderscoreWordSpaces();
    //  /** Creamos un String que contenga un array con las ciudades del txt
    //   * Aplicamos el método math random para que seleccione un numéro al azar que
    //   * se corresponda con una ciudad
    //   * Imprimimos nombre de la ciudad
    //   **/
    // Esto es para saber cuantas ciudades hay en la lista
    //  public Question(){
    final String[] cityList = {
      "Chongqing",
      "Shanghai",
      "Beijing",
      "Lagos",
      "Mumbai",
      "Dhaka",
      "Chengdu",
      "Karachi",
      "Guangzhou",
      "Istanbul",
      "Tokyo",
      "Tianjin",
      "Moscow",
      "Sao Paulo",
      "Kinshasa",
      "Delhi",
      "Baoding",
      "Lahore",
      "Wuhan",
      "Cairo",
      "Seoul",
      "Jakarta",
      "Wenzhou",
      "Lima",
      "Mexico City",
      "London",
      "Bangkok",
      "Xian",
      "Chennai",
      "Bangalore",
      "New York",
      "Ho Chi Minh City",
      "Hyderabad",
      "Shenzhen",
      "Suzhou",
      "Nanjing",
      "Dongguan",
      "Tehran",
      "Quanzhou",
      "Shenyang",
      "Bogota",
      "Hong Kong",
      "Baghdad",
      "Fuzhou",
      "Changsha",
      "Hanoi",
      "Rio de Janeiro",
      "Qingdao",
      "Foshan",
      "Zunyi",
      "Santiago",
      "Riyadh",
      "Ahmedabad",
      "Singapore",
      "Shantou",
      "Ankara",
      "Yangon",
      "Saint Petersburg",
      "Sydney",
      "Casablanca",
      "Melbourne",
      "Abidjan",
      "Alexandria",
      "Kolkata",
      "Surat",
      "Johannesburg",
      "Dar es Salaam",
      "Shijiazhuang",
      "Harbin",
      "Giza",
      "İzmir",
      "Zhengzhou",
      "Taipei",
      "Los Angeles",
      "Berlin",
      "Busan",
      "Madrid",
      "Buenos Aires",
      "Toronto",
      "Chicago",
      "Osaka",
      "Paris",
      "Vancouver",
      "Montreal",
      "San Francisco",
      "Boston",
      "Seattle",
      "Washington DC",
      "Philadelphia",
      "Portland",
      "Ottawa",
      "Miami",
      "Dallas",
      "Calgary",
      "Denver",
      "Detroit",
      "Houston",
      "Edmonton",
      "Las Vegas",
      "Atlanta"
    };



    int goodTries = 0;
    int count = 0;
    int NUM_TRIES = 10;
    int right = 0;
    int wrongGuesses = 0;

    int randomPosition = (int) Math.floor(Math.random() * cityList.length);
    String word = cityList[randomPosition];
    char[] letters = word.toCharArray();
    char[] underscoreCity = new char[letters.length];
    for (int i = 0; i < letters.length; i++) {
      underscoreCity[i] = '_';
    }

    System.out.println("Guess the city...");
    Scanner in = new Scanner(System.in);
    // System.out.println(new String(builder));
    System.out.println(underscoreCity);
    // Scanner guessLetter = new Scanner(System.in);
    System.out.println("Guess a letter: ");
    // System.out.println(builder);
    boolean win = false;
    boolean letterCorrect;
    while (win == false) {
      boolean foundLetter;
      char letterIntroduced = in.next().charAt(0);
      for (int i = 0; i < letters.length; i++) {
        if (letters[i] == letterIntroduced) {
          underscoreCity[i] = letterIntroduced;
          right++;
          count++;
          System.out.println("You got it! " + count + " letter(s) correct." );
        }
      }

      if (Arrays.equals(letters, underscoreCity)) {
        System.out.println("You win. The word is " + word);
        break;
      }
      System.out.println("Guess the city:");
      System.out.println(underscoreCity);
      //System.out.println("Wrong letters");
    }
  }
  }
