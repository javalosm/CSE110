package edu.ucsd.cs110.temperature;
public abstract class Temperature {
    private final float value; //public

    public Temperature(float v)
    {
        value = v;
    }
    public final float getValue()
    {
        return value;
    }
    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}