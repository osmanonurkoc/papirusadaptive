package osmanonurkoc.papirus

import com.github.javiersantos.piracychecker.PiracyChecker
import dev.jahir.blueprint.ui.activities.BottomNavigationBlueprintActivity

class MainActivity : BottomNavigationBlueprintActivity() {

    /**
     * These things here have the default values. You can delete the ones you don't want to change
     * and/or modify the ones you want to.
     */
    override val billingEnabled = true

    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = true
    override fun checkStores(): Boolean = true
    override val isDebug: Boolean = BuildConfig.DEBUG

    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlZJuwTXUcn3EjI/hTGvXqi7/hk/N8dVbW8smGcxuGxD2XWshhlnSmKKTNSKb+iOFw0Kn/CQP+GR+mDTbK2A4Ry7japTRQiXv0XpoyPVU7l7TuNV87kLOm3ePnTGto80QJGf4DkWUbo8xVzL8M+uJQ1D77W+R6T5FG6EpkiE8DZnCahK0KXbPWT701fL4TidaVwc+alVyatL7Lx9QrtE06Vaf+YTjfFz/rz2vWTaxqXcLNZNj0iVZO8nTOD6UxzA23PpX6zjN07cZN0IpdMBaJNkPtAruDDkgd5dLs+waUVIh5ji/fe7dUwPQHi+RYSzOcBlP8P8HPT3/SrhL+fcAdQIDAQAB"

    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        destroyChecker()
        return if (BuildConfig.DEBUG) null
        else super.getLicenseChecker()
    }

    override fun defaultTheme(): Int = R.style.MyApp_Default
    override fun amoledTheme(): Int = R.style.MyApp_Default_Amoled
}