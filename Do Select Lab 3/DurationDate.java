����   4 s  lab3/DurationDate  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Llab3/DurationDate; main ([Ljava/lang/String;)V	    java/lang/System   out Ljava/io/PrintStream;  7 Enter the Date here (YYYY/MM/DD Format Allowed) ----->
    java/io/PrintStream   println (Ljava/lang/String;)V  java/util/Scanner	  ! " # in Ljava/io/InputStream;
  %  & (Ljava/io/InputStream;)V
  ( ) * nextInt ()I
 , . - java/time/LocalDate / 0 of (III)Ljava/time/LocalDate;
 , 2 3 4 now ()Ljava/time/LocalDate;
  6 7  close
 9 ; : java/time/Period < = between >(Ljava/time/LocalDate;Ljava/time/LocalDate;)Ljava/time/Period; ? java/lang/StringBuilder A Difference is 
 > C  
 9 E F * getYears
 > H I J append (I)Ljava/lang/StringBuilder; L  years
 > N I O -(Ljava/lang/String;)Ljava/lang/StringBuilder; Q  
 9 S T * 	getMonths V  months 
 9 X Y * getDays [ days
 > ] ^ _ toString ()Ljava/lang/String;
  a b c printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; args [Ljava/lang/String; sc Ljava/util/Scanner; year I month date 	givendate Ljava/time/LocalDate; presentdate diff Ljava/time/Period; 
SourceFile DurationDate.java !               /     *� �    
                    	      4     �� � � Y�  � $L+� '=+� '>+� '6� +:� 1:+� 5� 8:� � >Y@� B� D� GK� MP� M� R� GU� MP� M� W� GZ� MP� M� \� � `W�    
   >      	       #  ,  1  5  >  J  \  n  �  �     R    � d e    y f g   t h i   o j i  # i k i  , ` l m  1 [ n m  > N o p   q    r