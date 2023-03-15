package app.mostbet.azerbaycan.mostbet.online.mostbet.uzbek.mostbet.mo

import android.app.Application
import com.onesignal.OneSignal
import com.yandex.metrica.YandexMetrica
import com.yandex.metrica.YandexMetricaConfig

class serviceInit: Application() {


    override fun onCreate() {
        super.onCreate()
        try {
            val gfdsfrgthgfdsfgfdd = YandexMetricaConfig.newConfigBuilder(keyStore.appmetrica).build()
            YandexMetrica.activate(applicationContext, gfdsfrgthgfdsfgfdd)
            YandexMetrica.enableActivityAutoTracking(this)
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
            OneSignal.initWithContext(this)
            OneSignal.setAppId(keyStore.onesignal)
        } catch (e: Exception) {
        }
    }


}