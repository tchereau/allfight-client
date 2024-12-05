import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class akn extends akq {
   private boolean char = false;
   private Socket case;
   private byte[] byte = new byte[1460];
   private String try;

   akn(amg var1, Socket var2) {
      super(var1);
      this.case = var2;

      try {
         this.case.setSoTimeout(0);
      } catch (Exception var4) {
         this.if = false;
      }

      this.try = var1.do("rcon.password", "");
      this.do("Rcon connection from: " + var2.getInetAddress());
   }

   public void run() {
      while(true) {
         try {
            if (!this.if) {
               break;
            }

            BufferedInputStream var1 = new BufferedInputStream(this.case.getInputStream());
            int var2 = var1.read(this.byte, 0, 1460);
            if (10 > var2) {
               return;
            }

            byte var3 = 0;
            int var4 = aks.if(this.byte, 0, var2);
            if (var4 == var2 - 4) {
               int var21 = var3 + 4;
               int var5 = aks.if(this.byte, var21, var2);
               var21 += 4;
               int var6 = aks.a(this.byte, var21);
               var21 += 4;
               switch(var6) {
               case 2:
                  if (this.char) {
                     String var8 = aks.do(this.byte, var21, var2);

                     try {
                        this.a(var5, this.a.H(var8));
                     } catch (Exception var16) {
                        this.a(var5, "Error executing: " + var8 + " (" + var16.getMessage() + ")");
                     }
                     continue;
                  }

                  this.int();
                  continue;
               case 3:
                  String var7 = aks.do(this.byte, var21, var2);
                  int var10000 = var21 + var7.length();
                  if (0 != var7.length() && var7.equals(this.try)) {
                     this.char = true;
                     this.a(var5, 2, "");
                     continue;
                  }

                  this.char = false;
                  this.int();
                  continue;
               default:
                  this.a(var5, String.format("Unknown request %s", Integer.toHexString(var6)));
                  continue;
               }
            }
         } catch (SocketTimeoutException var17) {
            break;
         } catch (IOException var18) {
            break;
         } catch (Exception var19) {
            System.out.println(var19);
            break;
         } finally {
            this.new();
         }

         return;
      }

   }

   private void a(int var1, int var2, String var3) {
      ByteArrayOutputStream var4 = new ByteArrayOutputStream(1248);
      DataOutputStream var5 = new DataOutputStream(var4);
      var5.writeInt(Integer.reverseBytes(var3.length() + 10));
      var5.writeInt(Integer.reverseBytes(var1));
      var5.writeInt(Integer.reverseBytes(var2));
      var5.writeBytes(var3);
      var5.write(0);
      var5.write(0);
      this.case.getOutputStream().write(var4.toByteArray());
   }

   private void int() {
      this.a(-1, 2, "");
   }

   private void a(int var1, String var2) {
      int var3 = var2.length();

      do {
         int var4 = 4096 <= var3 ? 4096 : var3;
         this.a(var1, 0, var2.substring(0, var4));
         var2 = var2.substring(var4);
         var3 = var2.length();
      } while(0 != var3);

   }

   private void new() {
      if (null != this.case) {
         try {
            this.case.close();
         } catch (IOException var2) {
            this.if("IO: " + var2.getMessage());
         }

         this.case = null;
      }
   }
}
