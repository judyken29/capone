����   4 X  
p1/DemoOne  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lp1/DemoOne; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Input first sub marks: 
 " $ # java/io/PrintStream % & print (Ljava/lang/String;)V
  ( ) * nextInt ()I , Input second sub marks:  . Input third sub marks:  0 Input fourth sub marks:  2 Enter fifth sub marks:  4 java/lang/StringBuilder 6 Sum is
 3 8  &
 3 : ; < append (I)Ljava/lang/StringBuilder;
 3 > ? @ toString ()Ljava/lang/String;
 " B C & println E Average of five numbers is: 
 3 G ; H (D)Ljava/lang/StringBuilder; args [Ljava/lang/String; j Ljava/util/Scanner; num1 I num2 num3 num4 num5 sum avg D 
SourceFile DemoOne.java !               /     *� �    
                    	      I  
   �� Y� � L� � !+� '=� +� !+� '>� -� !+� '6� /� !+� '6� 1� !+� '6````6� � 3Y5� 7� 9� =� Al�9� � 3YD� 7� F� =� A�    
   B      
        %  -  3  ;  A  I  O  ]  t  {  �     \ 	   � I J    � K L   { M N  % n O N  3 ` P N  A R Q N  O D R N  ] 6 S N  {  T U   V    W