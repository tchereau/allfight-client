import java.io.Reader;
import java.util.Arrays;

public final class la {
   public void a(Reader var1, lc var2) {
      lb var3 = new lb(var1);
      char var4 = (char)var3.do();
      switch(var4) {
      case '[':
         var3.a(var4);
         var2.do();
         this.a(var3, var2);
         break;
      case '{':
         var3.a(var4);
         var2.do();
         this.for(var3, var2);
         break;
      default:
         throw new ld("Expected either [ or { but got [" + var4 + "].", var3);
      }

      int var5 = this.case(var3);
      if (var5 != -1) {
         throw new ld("Got unexpected trailing character [" + (char)var5 + "].", var3);
      } else {
         var2.char();
      }
   }

   private void a(lb var1, lc var2) {
      char var3 = (char)this.case(var1);
      if (var3 != '[') {
         throw new ld("Expected object to start with [ but got [" + var3 + "].", var1);
      } else {
         var2.try();
         char var4 = (char)this.case(var1);
         var1.a(var4);
         if (var4 != ']') {
            this.if(var1, var2);
         }

         boolean var5 = false;

         while(!var5) {
            char var6 = (char)this.case(var1);
            switch(var6) {
            case ',':
               this.if(var1, var2);
               break;
            case ']':
               var5 = true;
               break;
            default:
               throw new ld("Expected either , or ] but got [" + var6 + "].", var1);
            }
         }

         var2.int();
      }
   }

   private void for(lb var1, lc var2) {
      char var3 = (char)this.case(var1);
      if (var3 != '{') {
         throw new ld("Expected object to start with { but got [" + var3 + "].", var1);
      } else {
         var2.if();
         char var4 = (char)this.case(var1);
         var1.a(var4);
         if (var4 != '}') {
            this.do(var1, var2);
         }

         boolean var5 = false;

         while(!var5) {
            char var6 = (char)this.case(var1);
            switch(var6) {
            case ',':
               this.do(var1, var2);
               break;
            case '}':
               var5 = true;
               break;
            default:
               throw new ld("Expected either , or } but got [" + var6 + "].", var1);
            }
         }

         var2.case();
      }
   }

   private void do(lb var1, lc var2) {
      char var3 = (char)this.case(var1);
      if ('"' != var3) {
         throw new ld("Expected object identifier to begin with [\"] but got [" + var3 + "].", var1);
      } else {
         var1.a(var3);
         var2.do(this.int(var1));
         char var4 = (char)this.case(var1);
         if (var4 != ':') {
            throw new ld("Expected object identifier to be followed by : but got [" + var4 + "].", var1);
         } else {
            this.if(var1, var2);
            var2.new();
         }
      }
   }

   private void if(lb var1, lc var2) {
      char var3 = (char)this.case(var1);
      switch(var3) {
      case '"':
         var1.a(var3);
         var2.a(this.int(var1));
         break;
      case '-':
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
         var1.a(var3);
         var2.if(this.byte(var1));
         break;
      case '[':
         var1.a(var3);
         this.a(var1, var2);
         break;
      case 'f':
         char[] var6 = new char[4];
         int var7 = var1.if(var6);
         if (var7 == 4 && var6[0] == 'a' && var6[1] == 'l' && var6[2] == 's' && var6[3] == 'e') {
            var2.a();
            break;
         }

         var1.a(var6);
         throw new ld("Expected 'f' to be followed by [[a, l, s, e]], but got [" + Arrays.toString(var6) + "].", var1);
      case 'n':
         char[] var8 = new char[3];
         int var9 = var1.if(var8);
         if (var9 != 3 || var8[0] != 'u' || var8[1] != 'l' || var8[2] != 'l') {
            var1.a(var8);
            throw new ld("Expected 'n' to be followed by [[u, l, l]], but got [" + Arrays.toString(var8) + "].", var1);
         }

         var2.byte();
         break;
      case 't':
         char[] var4 = new char[3];
         int var5 = var1.if(var4);
         if (var5 != 3 || var4[0] != 'r' || var4[1] != 'u' || var4[2] != 'e') {
            var1.a(var4);
            throw new ld("Expected 't' to be followed by [[r, u, e]], but got [" + Arrays.toString(var4) + "].", var1);
         }

         var2.for();
         break;
      case '{':
         var1.a(var3);
         this.for(var1, var2);
         break;
      default:
         throw new ld("Invalid character at start of value [" + var3 + "].", var1);
      }

   }

   private String byte(lb var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.do();
      if ('-' == var3) {
         var2.append('-');
      } else {
         var1.a(var3);
      }

      var2.append(this.for(var1));
      return var2.toString();
   }

   private String for(lb var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.do();
      if ('0' == var3) {
         var2.append('0');
         var2.append(this.if(var1));
         var2.append(this.goto(var1));
      } else {
         var1.a(var3);
         var2.append(this.else(var1));
         var2.append(this.new(var1));
         var2.append(this.if(var1));
         var2.append(this.goto(var1));
      }

      return var2.toString();
   }

   private char else(lb var1) {
      char var3 = (char)var1.do();
      switch(var3) {
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
         return var3;
      default:
         throw new ld("Expected a digit 1 - 9 but got [" + var3 + "].", var1);
      }
   }

   private char try(lb var1) {
      char var3 = (char)var1.do();
      switch(var3) {
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
         return var3;
      default:
         throw new ld("Expected a digit 1 - 9 but got [" + var3 + "].", var1);
      }
   }

   private String new(lb var1) {
      StringBuilder var2 = new StringBuilder();
      boolean var3 = false;

      while(!var3) {
         char var4 = (char)var1.do();
         switch(var4) {
         case '0':
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9':
            var2.append(var4);
            break;
         default:
            var3 = true;
            var1.a(var4);
         }
      }

      return var2.toString();
   }

   private String if(lb var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.do();
      if (var3 == '.') {
         var2.append('.');
         var2.append(this.try(var1));
         var2.append(this.new(var1));
      } else {
         var1.a(var3);
      }

      return var2.toString();
   }

   private String goto(lb var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.do();
      if (var3 != '.' && var3 != 'E') {
         var1.a(var3);
      } else {
         var2.append('E');
         var2.append(this.char(var1));
         var2.append(this.try(var1));
         var2.append(this.new(var1));
      }

      return var2.toString();
   }

   private String char(lb var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.do();
      if (var3 != '+' && var3 != '-') {
         var1.a(var3);
      } else {
         var2.append(var3);
      }

      return var2.toString();
   }

   private String int(lb var1) {
      StringBuilder var2 = new StringBuilder();
      char var3 = (char)var1.do();
      if ('"' != var3) {
         throw new ld("Expected [\"] but got [" + var3 + "].", var1);
      } else {
         boolean var4 = false;

         while(!var4) {
            char var5 = (char)var1.do();
            switch(var5) {
            case '"':
               var4 = true;
               break;
            case '\\':
               char var6 = this.a(var1);
               var2.append(var6);
               break;
            default:
               var2.append(var5);
            }
         }

         return var2.toString();
      }
   }

   private char a(lb var1) {
      char var3 = (char)var1.do();
      char var2;
      switch(var3) {
      case '"':
         var2 = '"';
         break;
      case '/':
         var2 = '/';
         break;
      case '\\':
         var2 = '\\';
         break;
      case 'b':
         var2 = '\b';
         break;
      case 'f':
         var2 = '\f';
         break;
      case 'n':
         var2 = '\n';
         break;
      case 'r':
         var2 = '\r';
         break;
      case 't':
         var2 = '\t';
         break;
      case 'u':
         var2 = (char)this.do(var1);
         break;
      default:
         throw new ld("Unrecognised escape character [" + var3 + "].", var1);
      }

      return var2;
   }

   private int do(lb var1) {
      char[] var2 = new char[4];
      int var3 = var1.if(var2);
      if (var3 != 4) {
         throw new ld("Expected a 4 digit hexidecimal number but got only [" + var3 + "], namely [" + String.valueOf(var2, 0, var3) + "].", var1);
      } else {
         try {
            int var4 = Integer.parseInt(String.valueOf(var2), 16);
            return var4;
         } catch (NumberFormatException var6) {
            var1.a(var2);
            throw new ld("Unable to parse [" + String.valueOf(var2) + "] as a hexidecimal number.", var6, var1);
         }
      }
   }

   private int case(lb var1) {
      boolean var3 = false;

      int var2;
      do {
         var2 = var1.do();
         switch(var2) {
         case 9:
         case 10:
         case 13:
         case 32:
            break;
         default:
            var3 = true;
         }
      } while(!var3);

      return var2;
   }
}
