import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

class aj6 extends Formatter {
   private SimpleDateFormat a;
   // $FF: synthetic field
   final aj8 if;

   private aj6(aj8 var1) {
      this.if = var1;
      this.a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   }

   public String format(LogRecord var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(this.a.format(var1.getMillis()));
      if (aj8.a(this.if) != null) {
         var2.append(aj8.a(this.if));
      }

      var2.append(" [").append(var1.getLevel().getName()).append("] ");
      var2.append(this.formatMessage(var1));
      var2.append('\n');
      Throwable var3 = var1.getThrown();
      if (var3 != null) {
         StringWriter var4 = new StringWriter();
         var3.printStackTrace(new PrintWriter(var4));
         var2.append(var4.toString());
      }

      return var2.toString();
   }

   // $FF: synthetic method
   aj6(aj8 var1, aj7 var2) {
      this(var1);
   }
}
