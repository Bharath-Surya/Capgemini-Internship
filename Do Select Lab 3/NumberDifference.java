����   4 i  lab3/NumberDifference  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Llab3/NumberDifference; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Enter the number ---->
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextLine ()Ljava/lang/String;
  	
  - . & modifyNumber
  0 1  close args [Ljava/lang/String; sc Ljava/util/Scanner; num Ljava/lang/String; nd
 : < ; java/lang/String = > toCharArray ()[C @ java/lang/StringBuffer
 ? 	
 ? C D E append (I)Ljava/lang/StringBuffer;
 : G H I length ()I
 : K L M charAt (I)C
 ? O D P (C)Ljava/lang/StringBuffer; R java/lang/StringBuilder T !Number Difference New Number---->
 Q V  &
 Q X D Y -(Ljava/lang/Object;)Ljava/lang/StringBuilder;
 Q [ \ * toString arr [C str Ljava/lang/StringBuffer; i I num1 num2 StackMapTable ^ 
SourceFile NumberDifference.java !               /     *� �    
                    	       �     *� Y� � L� � !+� 'M� Y� +N-,� ,+� /�    
         	        %  )     *    * 2 3     4 5    6 7    
 8    . &    +     z+� 9M� ?Y� AN6� ;,46,`46d� -d� BW� d� -d� BW�,�d���-++� Fd� J� NW� � QYS� U-� W� Z� !�    
   6             !  )  3   > " H  T % c & y '    H    z       z 6 7   u ] ^   m _ `   D a b   / c b  ! ' d b  e    �  f ?� "�   g    h