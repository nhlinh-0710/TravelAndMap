package BE;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class TelegramSender {
    private static final String BOT_TOKEN = "7644609348:AAHZWAsTQDgnB7gY8nbzJCS6x4giDyqV0Mo";
    private static final String CHAT_ID = "5435530023";

    public static void sendOTP(String otp) {
        try {
            String message = "M\u00e3 OTP c\u1ee7a b\u1ea1n: " + otp;
            String urlString = "https://api.telegram.org/bot" + BOT_TOKEN +
                    "/sendMessage?chat_id=" + CHAT_ID + "&text=" + URLEncoder.encode(message, "UTF-8");
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                System.out.println("OTP \u0111\u00e3 \u0111\u01b0\u1ee3c g\u1eedi th\u00e0nh c\u00f4ng!");
            } else {
                System.out.println("L\u1ed7i g\u1eedi OTP: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}