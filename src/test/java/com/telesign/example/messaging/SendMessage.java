
     package com.telesign.example.messaging;

  import com.telesign.MessagingClient;
  import com.telesign.RestClient;
  import com.telesign.Util;

  public class SendMessageWithVerificationCode {

      public static void main(String[] args) {

          String customerId = "2CCC4B4A-9111-4802-A302-10156BBC5034";
          String apiKey = "*********************************";

          String phoneNumber = "15052612036";
          String verifyCode = Util.randomWithNDigits(5);

          String message = String.format("Your code is %s", verifyCode);
          String messageType = "OTP";



          try {

              MessagingClient messagingClient = new MessagingClient(customerId, apiKey);
              RestClient.TelesignResponse telesignResponse = messagingClient.message(phoneNumber, message, messageType, null);
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
  }
  
