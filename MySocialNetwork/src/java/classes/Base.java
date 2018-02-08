
package classes;

import java.util.ArrayList;

public class Base {
    public static ArrayList <User> users=new ArrayList<User>();
    public static ArrayList <Publications> publications= new ArrayList<Publications>();
    static{
        
        ArrayList<User> a1=new ArrayList<User>();
        ArrayList<User> a2=new ArrayList<User>();
        ArrayList<User> a3=new ArrayList<User>();
        ArrayList<User> a4=new ArrayList<User>();
        ArrayList<User> a5=new ArrayList<User>();
        ArrayList<User> a6=new ArrayList<User>();
        ArrayList<User> a7=new ArrayList<User>();
        ArrayList<User> a8=new ArrayList<User>();
        ArrayList<User> a9=new ArrayList<User>();
        ArrayList<User> a10=new ArrayList<User>();
        ArrayList<User> a11=new ArrayList<User>();
        ArrayList<User> a12=new ArrayList<User>();
        ArrayList<User> a13=new ArrayList<User>();
        ArrayList<User> a14=new ArrayList<User>();
        ArrayList<User> a15=new ArrayList<User>();
        ArrayList<User> a16=new ArrayList<User>();
        ArrayList<User> a17=new ArrayList<User>();
        ArrayList<User> a18=new ArrayList<User>();
        ArrayList<User> a19=new ArrayList<User>();
        ArrayList<User> a20=new ArrayList<User>();
       
        
        
        User u1=new User(1,"Paul","Crowe",28,"Male",a1);
        User u2=new User(2,"Rob","Fitz",23,"Male",a2);
        User u3=new User(3,"Ben","O'Carolan",0,"Male",a3);
        User u4=new User(4,"Victor","",28,"Male",a4);
        User u5=new User(5,"Peter","Mac",29,"Male",a5);
        User u6=new User(6,"John","Barry",18,"Male",a6);
        User u7=new User(7,"Sarah","Lane",30,"Female",a7);
        User u8=new User(8,"Susan","Downe",28,"Feale",a8);
        User u9=new User(9,"Jack","Stam",28,"Male",a9);
        User u10=new User(10,"Amy","Lane",28,"Female",a10);
        User u11=new User(11,"Sandra","Phelan",28,"Female",a11);
        User u12=new User(12,"Laura","Murphy",33,"Female",a12);
        User u13=new User(13,"Lysa","Dali",28,"Female",a13);
        User u14=new User(14,"Mark","Johson",28,"Male",a14);
        User u15=new User(15,"Seamus","Crowe",24,"Male",a15);
        User u16=new User(16,"Daren","Slater",28,"Male",a16);
        User u17=new User(17,"Dara","Zoltan",48,"Male",a17);
        User u18=new User(18,"Marie","D",28,"Female",a18);
        User u19=new User(19,"Catriona","Long",28,"Female",a19);
        User u20=new User(20,"Katy","Couch",28,"Female",a20);
        u1.friends.add(u2);
        u2.friends.add(u1);
        u2.friends.add(u3);
        u3.friends.add(u2);
        u3.friends.add(u4);
        u3.friends.add(u5);
        u3.friends.add(u7);
        u4.friends.add(u3);
        u5.friends.add(u3);
        u5.friends.add(u6);
        u5.friends.add(u11);
        u5.friends.add(u10);
        u5.friends.add(u7);
        u6.friends.add(u5);
        u7.friends.add(u3);
        u7.friends.add(u5);
        u7.friends.add(u20);
        u7.friends.add(u12);
        u7.friends.add(u8);
        u8.friends.add(u7);
        u9.friends.add(u12);
        u10.friends.add(u5);
        u10.friends.add(u11);
        u11.friends.add(u5);
        u11.friends.add(u10);
        u11.friends.add(u19);
        u11.friends.add(u20);
        u12.friends.add(u7);
        u12.friends.add(u9);
        u12.friends.add(u13);
        u12.friends.add(u20);
        u13.friends.add(u12);
        u13.friends.add(u14);
        u13.friends.add(u20);
        u14.friends.add(u13);
        u14.friends.add(u15);
        u15.friends.add(u14);
        u16.friends.add(u18);
        u16.friends.add(u20);
        u17.friends.add(u18);
        u17.friends.add(u20);
        u18.friends.add(u17);
        u19.friends.add(u11);
        u19.friends.add(u20);
        u20.friends.add(u7);
        u20.friends.add(u11);
        u20.friends.add(u12);
        u20.friends.add(u13);
        u20.friends.add(u16);
        u20.friends.add(u17);
        u20.friends.add(u19);
        
        
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        users.add(u6);
        users.add(u7);
        users.add(u8);
        users.add(u9);
        users.add(u10);
        users.add(u11);
        users.add(u12);
        users.add(u13);
        users.add(u14);
        users.add(u15);
        users.add(u16);
        users.add(u17);
        users.add(u18);
        users.add(u19);
        users.add(u20);
        
        
        
        
        
            }
    public static User returnUser(String user,String pass){
        
        for(User i:users){
            if(i.firstName.equals(user)&& i.surname.equals(pass)){
                return i;
            }
            }
        
    return null;
    }
    
    public static ArrayList<User> friendsOfFriends(User user){
        ArrayList<User> friendsOfFr=new ArrayList<User>();
        for(User u:user.friends){
            for(User us:u.friends){
                if(!us.equals(user))
                friendsOfFr.add(us);
            }
        }
        
      
        
        return friendsOfFr;
    }
    
   /* public static ArrayList<User> recomendendFriends(User user){
        ArrayList<User> recFriends=new ArrayList<User>();
        ArrayList<User> frendsOfFr=Base.friendsOfFriends(user);
        ArrayList<User> frendsOfFr2=Base.friendsOfFriends(user);
        
        for(User u:user.friends){
            
            for(User us:users){
                for (User usr:us.friends){
                    if(u.equals(usr)){
                        recFriends.add(usr);
                    }
                }
            }
            
        }
        
        for(User i:recFriends){
            for(User a:user.friends){
                if(i.equals(a)){
                    recFriends.remove(a);
                }
            }
        }

      
        return recFriends;
        }*/
}
    
   

    
    

    
   





