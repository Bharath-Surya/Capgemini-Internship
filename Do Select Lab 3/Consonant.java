����   4 W  lab3/Consonant  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Llab3/Consonant; main ([Ljava/lang/String;)V	    java/lang/System   out Ljava/io/PrintStream;  Enter a String here ---->
    java/io/PrintStream   println (Ljava/lang/String;)V  java/util/Scanner	  ! " # in Ljava/io/InputStream;
  %  & (Ljava/io/InputStream;)V
  	
  ) * + nextLine ()Ljava/lang/String;
  - .  close
  0 1  alterString args [Ljava/lang/String; sc Ljava/util/Scanner; con s Ljava/lang/String;
 : < ; java/lang/String = > toCharArray ()[C @ java/lang/StringBuffer
 ? 	
 ? C D E append (C)Ljava/lang/StringBuffer;
  G  H (Ljava/lang/Object;)V str arr [C st Ljava/lang/StringBuffer; j I ch C i StackMapTable K 
SourceFile Consonant.java !               /     *� �    
                    	       �     *� � � Y�  � $L� Y� 'M+� (N+� ,,-� /�    
         	  
      $  )     *    * 2 3     4 5    6     
 7 8   1     �     �+� 9M� ?Y� AN6� �,4a� T,4e� K,4i� B,4o� 9,4u� 0,4A� ',4E� ,4I� ,4O� ,4U� ,,4U� 6,4Z� ,AU� $,4z� ,aU� ,46,`�U�,���a6� -,4� BW�,���� -� F�    
   J           m  u  �  �  �  �  �   � ! �  � $ � & � $ � ( � )    H    �       � I 8   � J K   � L M   � N O  � 	 P Q  �  R O  S    	�  T ?� Y
  U    V