����   4 h  lab3/SumByTokenizer  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Llab3/SumByTokenizer; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   #Enter the Numbers as Strings ----->
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextLine ()Ljava/lang/String; , java/lang/StringBuilder . You Entered ----->
 + 0  &
 + 2 3 4 append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 + 6 7 * toString 9 java/util/StringTokenizer ;  
 8 =  > '(Ljava/lang/String;Ljava/lang/String;)V
 8 @ A * 	nextToken
 C E D java/lang/Integer F G parseInt (Ljava/lang/String;)I
 " I % J (I)V
 8 L M N hasMoreTokens ()Z P The sum is: 
 + R 3 S (I)Ljava/lang/StringBuilder;
  U V  close args [Ljava/lang/String; sum I sc Ljava/util/Scanner; s Ljava/lang/String; st Ljava/util/StringTokenizer; i StackMapTable X e java/lang/String 
SourceFile SumByTokenizer.java !               /     *� �    
                    	      &     y<� Y� � M� � !,� 'N� � +Y-� /-� 1� 5� !� 8Y-:� <:� � ?� B6� � H`<� K��� � +YO� /� Q� 5� !,� T�    
   :        
     0  <  ?  I  Q  V  ^  t  x     >    y W X    w Y Z   l [ \   _ ] ^  < = _ `  I  a Z  b    � ?  c  d 8    f    g