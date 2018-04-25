object Rover extends App{
  val currentPoint:Point = _
  val currentDirection:Space = _

  Rover(x:Int, y:Int, direction:Space){

    def move(movement: Movement): Boolean ={
      pointDeterminant: Point = this.currentPoint

      movement match{
        case Forward =>
          currentDirection match {
            case North => pointDeterminant = new Point(this.currentPoint.getX(), this.currentPoint.getY())) )
          }
      }

      this.curentPoint = pointDeterminant
    }

     val coordinateIncrement:Int(coordinate:Int){
        coordinate+1
    }

     val getPoint:Point():Point{
        this.currentPoint

    }



}