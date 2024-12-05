import java.security.PrivilegedAction;

class mq implements PrivilegedAction {
   // $FF: synthetic field
   final mr a;

   mq(mr var1) {
      this.a = var1;
   }

   public Object run() {
      mr.a(this.a);
      return null;
   }
}
