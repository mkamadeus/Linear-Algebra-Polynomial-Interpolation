
import florencia.augmentedmatrix.AugmentedMatrix;
import florencia.matrix.*;


public class Main
{
    public static void main(String args[]) throws Exception
    {
        /*
        AugmentedMatrix aug = new AugmentedMatrix();

        
        aug.inputLinearEquation();
        
        aug.gaussJordanElimination();
        aug.convertToSolutionInfinite();
        System.out.println();
        */

        // aug.printAugmentedMatrix();
        // System.out.println();
        
        // double[][] res = aug.infiniteSolutionMatrix();
        // for(int i=0;i<aug.getLeftMatrix().colCount;i++)
        // {
        //     for(int j=0;j<aug.getLeftMatrix().colCount+1;j++) System.out.print(res[i][j] + " ");
        //     System.out.println();
        // }
        // aug.backwardSubstitution();
        // for(int i=0;i<aug.getLeftMatrix().colCount;i++)
        // {
        //     for(int j=0;j<aug.getLeftMatrix().colCount+1;j++) System.out.print(res[i][j] + " ");
        //     System.out.println();
        // }
        // aug.convertToSolutionInfinite();
        // Determinant d = new Determinant();
        // d.mat.inputMatrix();
        
        // Matrix result = new Matrix();
        
        // result = d.inverseGaussJordan();
        // result.printMatrix();
<<<<<<< HEAD
        
        Matrix MT = new Matrix();
        MT.textToMatrix();
        //MT.printMatrix();
        
        System.out.println("---------------------------------------------");
        
        AugmentedMatrix aug = new AugmentedMatrix();
        aug.textToAug();
        //aug.printAugmentedMatrix();
=======

        Matrix MT = new Matrix();
        MT.textToMatrix();
        MT.printMatrix();
        // AugmentedMatrix augMat = new AugmentedMatrix();
        // augMat.textToAug();

        //MT.textToMatrix();

        // AugmentedMatrix augMat = new AugmentedMatrix();
        // augMat.textToAug();
        // System.out.println("Cramer Start");
        // augMat.Cramer();

       AugmentedMatrix aug = new AugmentedMatrix();
       aug = aug.makeInterpolationMatrix();
       aug.convertToInterpolation(aug);

>>>>>>> a7d52dc950b7c3a0d6ede06e1088cc4805d709f6
    }
}