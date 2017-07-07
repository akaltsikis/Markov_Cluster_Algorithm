import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
import scala.io.Source
import scala.reflect.ClassTag
import scala.reflect.io.Path
import scala.util.Try
sc.setLogLevel("INFO")
val lines = sc.textFile("/path/to/input/file")
val lines5=lines.map(s => s.split("\\$|\\s")).map(s => (s(0)+"-"+s(1),s(3)+"-
"+s(4),"%.5f".format(s(6).toDouble/100)))
lines5.first()
val data= lines5.toDF("key1","key2","value")
data.take(1)
data.count()
val newdata=data.sort($"value".desc).dropDuplicates(Array("key1","key2"))
newdata.count()
val lines6= newdata.map(s => s(0)+" "+s(1)+" "+ s(2))
lines6.take(20)
lines6.coalesce(1).saveAsTextFile("/path/to/output/folder")
