package revengerfitness.composelayoutt6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}
@Preview(showBackground = true
, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction(){
   /* Column (
        verticalArrangement = Arrangement.SpaceBetween,//explore
        horizontalAlignment = Alignment.CenterHorizontally//explore
    ){
        Text(text = "prashant chauhan", fontSize = 24.sp)
        Text(text = "Aarav chauhan", fontSize = 24.sp)
    }
*/

    Row(horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically) {
        Text(text = "prashant", fontSize = 24.sp)
        Text(text = "Aarav", fontSize = 24.sp)
    }
}
@Composable
fun TextInput(){

}

