package app.mostbet.azerbaycan.mostbet.online.mostbet.uzbek.mostbet.mo.adapter

import android.content.Context
import android.content.res.Resources
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import app.mostbet.azerbaycan.mostbet.online.mostbet.uzbek.mostbet.mo.R
import java.util.*

internal class adapt (
    private val sdfghtgdrfvgbhfytgdfvbghfvcbgnhfgdhnf: Context,
    private val hgsfdvgkjhgkudhjfgvkafdvds: Int,
    private val sdczgxcvbsfjhzcvchgfzdnbcxvfdcvx: Int
) :
    BaseAdapter() {
    private val zcxhgvjhdgzxvchcgdsfvxchgbvDXhcgbvzdfghdnhgcxnbvchgzdsdcdsf: ArrayList<String?> = ArrayList()
    private val hsagfdcdhtfagsdcfcsdahcfdshetfsfdtsyc: String = "balaboll"
    private val ydgshfbvchzfdgyrdhfgvbdhfajgsd: Resources

    private enum class uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS {
        fdshvgyfgdjhvguydaghvcfdjvgaf, jhfgdkvauygvuygdshkajgsuydhfasd, ugfdakuyvgdsiyi6etyrdfygshdkgaud
    }
    private val checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg
            : ArrayList<uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS> = ArrayList()

    init {

        ydgshfbvchzfdgyrdhfgvbdhfajgsd = sdfghtgdrfvgbhfytgdfvbghfvcbgnhfgdhnf.resources

        sduyfghvkujhsdgfkcuyfhfskdhgfksefd()

        sfdvhgkjhdsfgkhsdgfkhjmnfudjhsfdsa()
    }

    private fun sduyfghvkujhsdgfkcuyfhfskdhgfksefd() {
        zcxhgvjhdgzxvchcgdsfvxchgbvDXhcgbvzdfghdnhgcxnbvchgzdsdcdsf.clear()
        for (i in 0 until hgsfdvgkjhgkudhjfgvkafdvds * sdczgxcvbsfjhzcvchgfzdnbcxvfdcvx / 2) {
            zcxhgvjhdgzxvchcgdsfvxchgbvDXhcgbvzdfghdnhgcxnbvchgzdsdcdsf.add(hsagfdcdhtfagsdcfcsdahcfdshetfsfdtsyc + Integer.toString(i))
            zcxhgvjhdgzxvchcgdsfvxchgbvDXhcgbvzdfghdnhgcxnbvchgzdsdcdsf.add(hsagfdcdhtfagsdcfcsdahcfdshetfsfdtsyc + Integer.toString(i))
        }
        Collections.shuffle(zcxhgvjhdgzxvchcgdsfvxchgbvDXhcgbvzdfghdnhgcxnbvchgzdsdcdsf)
    }

    private fun sfdvhgkjhdsfgkhsdgfkhjmnfudjhsfdsa() {
        checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg.clear()
        for (i in 0 until hgsfdvgkjhgkudhjfgvkafdvds * sdczgxcvbsfjhzcvchgfzdnbcxvfdcvx) checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg.add(uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.jhfgdkvauygvuygdshkajgsuydhfasd)
    }

    override fun getCount(): Int {
        return hgsfdvgkjhgkudhjfgvkafdvds * sdczgxcvbsfjhzcvchgfzdnbcxvfdcvx
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(iuilalvafdhlbjvalhbjvdahbjvdlb: Int, vkfdjhvjhbdjhvdahjvfd: View?, dhghkvbjvjlbvvvvhv: ViewGroup): View {
        val sfghfajdhkajhfsdkjhfgsadjhf: ImageView =
            if (vkfdjhvjhbdjhvdahjvfd == null) ImageView(sdfghtgdrfvgbhfytgdfvbghfvcbgnhfgdhnf) else vkfdjhvjhbdjhvdahjvfd as ImageView // выводиться у нас будет картинка
        when (checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg[iuilalvafdhlbjvalhbjvdahbjvdlb]) {
            uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.fdshvgyfgdjhvguydaghvcfdjvgaf -> {
                val jhugygfdaghdfjdsaffffdsf = ydgshfbvchzfdgyrdhfgvbdhfajgsd.getIdentifier(zcxhgvjhdgzxvchcgdsfvxchgbvDXhcgbvzdfghdnhgcxnbvchgzdsdcdsf[iuilalvafdhlbjvalhbjvdahbjvdlb], "drawable", sdfghtgdrfvgbhfytgdfvbghfvcbgnhfgdhnf.packageName)
                sfghfajdhkajhfsdkjhfgsadjhf.setImageResource(jhugygfdaghdfjdsaffffdsf)
            }
            uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.jhfgdkvauygvuygdshkajgsuydhfasd -> sfghfajdhkajhfsdkjhfgsadjhf.setImageResource(R.drawable.iuiudfgiuhfduigsdf)
            else -> sfghfajdhkajhfsdkjhfgsadjhf.setImageResource(R.drawable.hdhfuhsdgfikgsgdhfvbsd)
        }
        return sfghfajdhkajhfsdkjhfgsadjhf
    }
    fun sfguhfadiljgheruighfdljkfhgadiur() {
        val iuahgiudfhgaruighodfgaiurgy = checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg.indexOf(uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.fdshvgyfgdjhvguydaghvcfdjvgaf)
        val fduighfougahfdiugfugfhdkfjhgauigdrhdfjgarufg = checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg.lastIndexOf(uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.fdshvgyfgdjhvguydaghvcfdjvgaf)
        if (iuahgiudfhgaruighodfgaiurgy == fduighfougahfdiugfugfhdkfjhgauigdrhdfjgarufg) return
        if (zcxhgvjhdgzxvchcgdsfvxchgbvDXhcgbvzdfghdnhgcxnbvchgzdsdcdsf[iuahgiudfhgaruighodfgaiurgy] == zcxhgvjhdgzxvchcgdsfvxchgbvDXhcgbvzdfghdnhgcxnbvchgzdsdcdsf[fduighfougahfdiugfugfhdkfjhgauigdrhdfjgarufg]) {
            checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg[iuahgiudfhgaruighodfgaiurgy] = uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.ugfdakuyvgdsiyi6etyrdfygshdkgaud
            checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg[fduighfougahfdiugfugfhdkfjhgauigdrhdfjgarufg] = uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.ugfdakuyvgdsiyi6etyrdfygshdkgaud
        } else {
            checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg[iuahgiudfhgaruighodfgaiurgy] = uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.jhfgdkvauygvuygdshkajgsuydhfasd
            checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg[fduighfougahfdiugfugfhdkfjhgauigdrhdfjgarufg] = uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.jhfgdkvauygvuygdshkajgsuydhfasd
        }
        return
    }
    fun djgrajgkruhsgjjgstnigjhfgfdsf(hfjsvbgksjhgfdjkvbfjhgfdj: Int): Boolean {
        if (checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg[hfjsvbgksjhgfdjkvbfjhgfdj] === uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.ugfdakuyvgdsiyi6etyrdfygshdkgaud || checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg[hfjsvbgksjhgfdjkvbfjhgfdj] === uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.fdshvgyfgdjhvguydaghvcfdjvgaf) return false
        if (checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg[hfjsvbgksjhgfdjkvbfjhgfdj] !== uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.ugfdakuyvgdsiyi6etyrdfygshdkgaud) checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg[hfjsvbgksjhgfdjkvbfjhgfdj] = uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.fdshvgyfgdjhvguydaghvcfdjvgaf
        notifyDataSetChanged()
        return true
    }
    fun jhkfvlfkzdhglrjkgdvifdjgbdgdf(): Boolean {
        return if (checkUggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYSImg.indexOf(uggfduguagdsuyfuye7f6gvute6UYFTDSFF7REFYS.jhfgdkvauygvuygdshkajgsuydhfasd) < 0) true else false
    }
}