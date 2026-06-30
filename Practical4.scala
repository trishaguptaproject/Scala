import breeze.linalg._
import scala.util.Random

object Practical4 {

  def main(args: Array[String]): Unit = {

    val random = new Random()

    // Generate a random 3x3 matrix with values between 10 and 50
    val matrix = DenseMatrix.tabulate[Double](3, 3) { (_, _) =>
      random.nextInt(41) + 10
    }

    // Compute transpose
    val transpose = matrix.t

    // Compute determinant
    val determinant = det(matrix)

    // Display results
    println("Random Matrix:")
    println(matrix)

    println("\nTranspose:")
    println(transpose)

    println(f"\nDeterminant: $determinant%.2f")
  }
}