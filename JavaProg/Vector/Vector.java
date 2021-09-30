/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ubuntu
 */
public class Vector {
    
    double var_x;
    double var_y;

    public Vector(double var_x, double var_y) {
        this.var_x = var_x;
        this.var_y = var_y;
    }
    
    public double getMagnitude()
    {
        double myMagn = Math.sqrt(Math.pow(var_x, 2) + Math.pow(var_y,2));
        return myMagn;
    }
    
    public Vector add(Vector addVector){
        double new_x = var_x + addVector.var_x;
        double new_y = var_y + addVector.var_y;        
        return new Vector(new_x, new_y);
    }
    
    public Vector multiply(double myMulti)
    {
        double new_x = var_x*myMulti;
        double new_y = var_y*myMulti;
        return new Vector(new_x, new_y);        
    }
    
    public double dotProduct(Vector dotVector){
        double new_x = var_x * dotVector.var_x;
        double new_y = var_y * dotVector.var_y;
        double resDot = new_x + new_y;
        return resDot;
    }

    @Override
    public String toString() {
        return "Vector{" + "var_x=" + var_x + ", var_y=" + var_y + '}';
    } 
  
    
}
