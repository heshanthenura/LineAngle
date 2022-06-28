package com.heshanthenura.lineangle;

public class Coordinates {

 //Degree to Radians
 public static double Rad(double degree){
     double rad = (Math.PI/180)*degree;
     return rad;
 }

 // X Coordinate
 public static double Xcord(double degree){
     double Xcord = Math.cos(Rad(degree))*150;
     return Xcord;
 }

 // Y Coordinate
 public static double Ycord(double degree){
     double Ycord = Math.sin(Rad(degree))*150;
     return Ycord;
 }

}
