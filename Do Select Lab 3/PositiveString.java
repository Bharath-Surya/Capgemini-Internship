����   4 M  lab3/PositiveString  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Llab3/PositiveString; main ([Ljava/lang/String;)V	    java/lang/System   out Ljava/io/PrintStream;  Enter a String here ---->
    java/io/PrintStream   println (Ljava/lang/String;)V  java/util/Scanner	  ! " # in Ljava/io/InputStream;
  %  & (Ljava/io/InputStream;)V
  ( ) * nextLine ()Ljava/lang/String;
  , -  close
  	
  0 1 2 string (Ljava/lang/String;)Z
  4  5 (Z)V args [Ljava/lang/String; sc Ljava/util/Scanner; str Ljava/lang/String; ps
 > @ ? java/lang/String A B toCharArray ()[C arr [C i I a b StackMapTable D 
SourceFile PositiveString.java !               /     *� �    
                    	       �     0� � � Y�  � $L+� 'M+� +� Y� .N� -,� /� 3�    
           	  
   $  /     *    0 6 7     8 9    : ;  $  <    1 2     �     ,+� =M>� ,46,`46� ��,�d����    
   "       
          *     >    ,       , : ;   ' C D   # E F    G F   	 H F  I    � 
 J  K    L