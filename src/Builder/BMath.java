package Builder;

public class BMath {

    public static float square(float x) {
        return x * x;
    }

    public static class Vector2{
        public float X;
        public float Y;

        public Vector2(float x, float y){
            this.X = x;
            this.Y = y;
        }

        public float GetAngleTo(Vector2 vec){return (float)Math.atan2(Y - vec.Y, X - vec.X);}
    }
}
