����   4 R  lab3/MirrorImage  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Llab3/MirrorImage; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Enter a String here---->
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * next ()Ljava/lang/String;
  , - & getImage args [Ljava/lang/String; sc Ljava/util/Scanner; str Ljava/lang/String; 5 java/lang/StringBuffer
 4 7  &
 4 9 : ; reverse ()Ljava/lang/StringBuffer;
 4 = > * toString @ java/lang/StringBuilder
 B D C java/lang/String E F valueOf &(Ljava/lang/Object;)Ljava/lang/String;
 ? 7 I |
 ? K L M append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 ? = string 
SourceFile MirrorImage.java !               /     *� �    
                    	       k     � Y� � L� � !+� 'M,� +�    
         
                . /     0 1    2 3   - &     y     /*L� 4Y+� 6� 8� <M� � ?Y+� A� GH� J,� J� N� !�    
            .          / 2 3    - O 3    : 3   P    Q