import java.util.Scanner;
import java.util.Date;
//import java.javax.JOptionPane;
import java.util.Scanner;
//import static.lang.system.out;

class Spot
     {
       static
          { 
           System.out.println("welcome");
           Date date=new Date();
           System.out.println(new Date());
          }
       public static void main(String ...arg)
           {
            Scanner sc=new Scanner(System.in);
         System.out.println("enter password");
            String password=sc.next();
           if(password.equals("picnic"))
      {
   System.out.println("enter the choice to know the spot in your range in kilometer");
  
System.out.println("press 1 to know the pinic spot witnin 10-20km");
System.out.println("press 2 to know the pinic spot witnin 20-30km");
System.out.println("press 3 to know the pinic spot witnin 30-40km");
System.out.println("press 4 to know the pinic spot witnin 40-50km");
int range=sc.nextInt();
switch(range)
{
case 1:
      System.out.println("Thankyou for visiting here");
      System.out.println("press 1 to details about MAYANK BLUE WATERPARK");
      System.out.println("press 2 to know details about REGIONAL PARK");
break;
    case 2:
    System.out.println("Thankyou for visiting here");
     System.out.println("press 1 to details about MAYANK BLUE WATERPARK");
      System.out.println("press 2 to know details about REGIONAL PARK");
     System.out.println("press 3 to know details about Tafreeh Agro Park");
      System.out.println("press 4 to know details about tincha Fall");
break;
   case 3:
    System.out.println("Thankyou for visiting here");
     System.out.println("press 1 to details about MAYANK BLUE WATERPARK");
      System.out.println("press 2 to know details about REGIONAL PARK");
     System.out.println("press 3 to know details about Tafreeh Agro Park");
      System.out.println("press 4 to know details about tincha Fall");
   System.out.println("press 5 to know details about choral river");
    System.out.println("press 6 to know details about janapav");
break;
    case 4:
 System.out.println("Thankyou for visiting here");
     System.out.println("press 1 to details about MAYANK BLUE WATERPARK indore");
      System.out.println("press 2 to know details about REGIONAL PARK indore");
     System.out.println("press 3 to know details about Tafreeh Agro Park indore");
      System.out.println("press 4 to know details about tincha Fall indore");
     System.out.println("press 5 to know details about cresent indore");
      System.out.println("press 6 to know details about janapav indore");
      System.out.println("press 7 to know detailes about chidiyabadak indore");
  break;
default: 
  System.out.println("wrong range2");
}
    int range2=sc.nextInt(); 
     switch(range2)
      {
       case 1:
System.out.println("address & contact\n Bicholi Mardana, Kanadiya Road, Indore, Madhya Pradesh\n 452016, India\n+91-731-2847394\n+91-9893054259 good for Fun Lovers Adventure Seekers Experience Seekers\n\ntimings\n\nAll days of the week\n11:00 AM - 7:00 PM \nvisit duration\n\n2 to 3 hours price\n250 per person for Adults\n150 per person for Children\n\n DESCRIPTION ABOUT THE PLACE \nMayank Blue Water Park is a simple, basic and good spot to cool off in the heat over the weekend. Some of the slides are good fun and if you are not that confident about your vertigo angle then just staying in the pool will serve the purpose for sure. Although the changing rooms could be made better if there was a higher standard of maintenance but it is still good to go! The water park is a nice place if you are game for a fun-filled day's outing with your family and friends and the kids are going to love the thrilling rides. It was the first water park in Madhya Pradesh. Along with rides, the water park is equipped with all the facilities like snooker,discotheque, health club banquet hall and much more.");
     break; 

      case 2:
  System.out.println("Regional Park Address: Pipliyapala Park IDA Site, Indore, Madhya Pradesh 452020, India\n\nRegional Park Contact Number: +91-7312910226\n\nRegional Park Timing: 11:00 am - 09:00 pm\n\nRegional Park Price: 25 INR\n\nBest time to visit Regional Park(preferred time): 04:00 pm - 07:00 pm\n\nTime required to visit Regional Park: 02:00 Hrs\n \n DESCRIPTION ABOUT THE Regional park:The very attractive and beautiful park - the Atal Bihari Vajpayee Regional Park - also known as Pipliyapala Park or Indore Regional Park, has been developed by the Indore Development Authority (IDA). Development of the park is around 80 acres of a lake and 42 acres land near this water body. There is also a canal, which covers the whole park. Various attractions in the park include boating, musical fountains, jumping jet-fountain Artists Village, Indian Gardens or Necklace Gardens, French Gardens Maze and Labyrinth Bio-diversity Garden Mist Fountain Lake-view Point Amphitheatre and a Fast food Zone."); 
   break;
  case 3:
  System.out.println("Address: 8th KM Dhar Road, Post Sirpur, Village, Sinhasa, Indore, Madhya Pradesh 452001\n\nHours: Open ⋅ Closes 6PM\n\nPhone: 097536 30711\n\nSuggested Duration:More than 3 hours\n\n price:400 perperson\n\nDESCRIPTION ABOUT THE PLACE\nTafreeh Agro Park is a big park spread over the area of 40-acre.It is a celebration of undiluted joy of nature and agrarian culture. If some one is interested in adventure they can enjoy angling and boating in Pokhar, amazing sports like Tarzan’s Swing, Monkey Bridge or hooking yourself to a rope crossing over an artificial pond or simply take a boat ride. The park facilitates dormitories and rooms for students and staff visiting to camp down the farm and explore the untouched rural life and farming experience.");
break;
    case 4:
    System.out.println("Tincha Water Falls Address: Ujjain District, Berchha, Madhya Pradesh 452020, Indore, India\n\nTincha Water Falls Timing: 24-hrs\n\nBest time to visit Tincha Water Falls(preferred time): 08:00 am - 06:00 pm\n\nTime required to visit Ticha Water Falls: 02:00 Hrs\n\nTry the best online travel planner to plan your travel itinerary!\n\nDESCRIPTION ABOUT THE PLACE\ntincha fallAbout 25 kilometres away from the main city of Indore, are these beautiful waterfalls that are a must-see if you're visiting Indore during the monsoons. A perfect getaway from the busy streets of the city, Tincha Falls are nature's gift to you. Along with the cascading waterfall, this place also provides you a pond and a valley, making it a complete haven for nature lovers. Spread a picnic on the lush green land around the water body, trek around the area or just take a dip in the cool waters of the pond this place is a complete package for every kind of visitor.");
break;
  case 5:
  System.out.println("Address: Gram Jamniya, Near Narmada Kshipra Devguradia Khurd, Kampel Rd, Indore, Madhya Pradesh 452016\n\nHours: Open ⋅ Closes 6PM\n\nPhone: 087208 88881\n\n DESCRIPTION ABOUT CRESENT WATERPARK: Crescent Water Park, one of India’s finest family water park, is located just 15 minutes from Indore city, we feature the largest variety of attractions (12) in Central India. Crescent Water park has more family tube rides than any other park in Malwa zone. Thrill rides are in abundance. Plenty of picnic areas are available, from covered pavilions (cabanas) to beautifully landscaped grass areas. It is one of the best amusement parks of Madhya Pradesh.Rides like Glider, Columbus, Gyroscope, HMGR and Mini train cup soccer sun and moon are super fun for the people who are trying it for first time.Nearby restaurants\nNi Hao 49 reviews\n\n8.7 km Chinese Gfc 23 reviews\n\n5.6 kmIndian Khanabadosh\n\n17 reviews\n\n8.9 kmIndian Jonathans Kitchen 6 reviews 9.3 kmItalian.");
break;
  case 6:
   System.out.println("Janapav Address: Janapav Kuti, Madhya Pradesh, Indore, India\n\nJanapav Timing: 24-hrs\n\nBest time to visit Janapav(preferred time): 08:00 am - 05:00 pm\n\nTime required to visit Janapav: 0:00 Hrs\n\nTry the best online travel planner to plan your travel itinerary!DESCRIPTION ABOUT THE PLACE JANAPAV Along the Indore-Mumbai highway, is this magical mountain, which is the birthplace of Lord Parshurama, the sixth avatar of the Hindu god Lord Vishnu. The monsoons turn the mountain into a lush green paradise where you can enjoy some peaceful time away from the city's rush. For the adventurous ones, this place is perfect for you to go trekking along the scenic route. The most famous highlight about Janapav, is the fair held on the occassion of Kartik Purnima, which is the first full moon after the festival of Diwali.");
  case 7:
  System.out.println("Address: Katkut, Badhwah, Madhya Pradesh 451001\n\nHours: Closes soon: 5PM ⋅ Opens 6AM Sun\n\nStarting From18% OFF 793-650per adult\n\nDESCRIPTION ABOUT THE PLACE\nChidiya Bhadak Fall, Indore Overview:Chidiya Bhadak Falls is one of the unexplored and secret gem of Indore. Enveloped in lush greenery, and rocky cliffs, the waterfalls is a mesmerizing sight to watch and is a picture worth capturing. The waterfall also offer good trekking and hiking opportunities.");
  break;
 
  default:

  System.out.println("wrong range");
}
}
else
System.out.println("wrong pwd");
}
}
