package com.company;

public class Train {

      String type;
      String form;
      float wagonssquare;
      int wagons;
      String color;

      @Override
      public String toString() {
            return "Train{" +
                    "type='" + type + '\'' +
                    ", form='" + form + '\'' +
                    ", wagonssquare=" + wagonssquare +
                    ", wagons=" + wagons +
                    ", color='" + color + '\'' +
                    '}';
      }

      public Train(String type, String form, float wagonssquare, int wagons, String color){
            this.type = type;
            this.form = form;
            this.wagonssquare = wagonssquare;
            this.wagons = wagons;
            this.color = color;




      }


            }









