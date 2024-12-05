import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class alk extends Thread {
   // $FF: synthetic field
   final alm a;

   alk(alm var1) {
      this.a = var1;
   }

   public void run() {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));

      String var2;
      try {
         while(!this.a.hB() && this.a.g8() && (var2 = var1.readLine()) != null) {
            this.a.a(var2, (ar0)this.a);
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }
}
