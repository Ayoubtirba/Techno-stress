package Modele.dao;

import java.sql.ResultSet;
import java.util.List;

import Modele.entites.Psy;
import Modele.entites.User;

public interface IUserDao {
	
	
   List<User> getalluser();
   void ajouteUser(User U);
   void suppermierUser(int id);
   ResultSet getauthuPsy(String email,String password);
   List<Psy> getPsy(int id);
   void modifierPsy(Psy p);
   List<Psy> getallPsy();
   void ajouteUser(Psy y);
   void suppermierPsy(int id);
   ResultSet getauthuser(String email,String password);
   List<User> getuser(int id);
   void modifierUser(User U);
   List<Psy> getPsyemail(String email);
   List<User> getuseremail(String email);
   ResultSet getauthRh(String email,String password);
   

}
