//import com.intel.analytics.bigdl._
//import com.intel.analytics.bigdl.utils.WordMeta

import scala.collection.mutable.{ArrayBuffer, Map => MMap}
import scala.language.existentials
import scala.io.Source

object TextClassifier{
//  def buildWord2Vec(word2Meta: Map[String, WordMeta]) : Map[Float, Array[Float]] = {
//    val preWord2Vec = MMap[Float, Array[Float]]()
//    val fileName = s"glove.6B.200d.txt"
//    for(line <- Source.fromFile(fileName, "ISO-8859-1").getLines){
//      val values = line.split(" ")
//      val word = values(0)
//      if(word2Meta.contains(word)){
//        val coefs = values.slice(1, values.length).map(_.toFloat)
//        preWord2Vec.put(word2Meta(word).index.toFloat, coefs)
//      }
//    }
//
//    preWord2Vec.toMap
//  }

  def main(args:Array[String]):Unit = {
    print("hello")
  }

}
