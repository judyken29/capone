����   4 Q  p1/DemoThree  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lp1/DemoThree; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;    Enter  date
 " $ # java/io/PrintStream % & print (Ljava/lang/String;)V
  ( ) * nextInt ()I , 	 Invalid  . java/lang/StringBuilder
 0 2 1 java/lang/String 3 4 valueOf (I)Ljava/lang/String;
 - 6  & 8 th
 - : ; < append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 - > ? @ toString ()Ljava/lang/String; B st D nd F rd args [Ljava/lang/String; j Ljava/util/Scanner; date I r StackMapTable 
SourceFile DemoThree.java !               /     *� �    
                    	      |     ݻ Y� � L� � !+� '=� 	� � +� !� �� � 	� � � -Y� /� 57� 9� =� !� �
p>� � � -Y� /� 5A� 9� =� !� ^� � � -Y� /� 5C� 9� =� !� =� � � -Y� /� 5E� 9� =� !� � � -Y� /� 57� 9� =� !�    
   B          
 "  -  ?  [  `  e  �  �  �  �  �  �     *    � G H    � I J   � K L  ` | M L  N    � " 
� %  �   O    P