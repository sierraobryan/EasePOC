package com.example.sierraobryan.ease_poc.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.SeekBar
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.sierraobryan.ease_poc.R
import com.example.sierraobryan.ease_poc.data.DailyPersonalData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_you.*

class YouFragment : Fragment() {

    var journalEntry: String = ""
    var progress: Int = 0

    companion object {
        fun newInstance() = YouFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_you, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity!!.app_bar_title.text = resources.getText(R.string.title_you)
        setUpSeekBar(seekBar)
        setUpSave(save_button)
    }

    private fun setUpSave(button: Button) {
        button.setOnClickListener {
            var dailyData = DailyPersonalData(progress, journal_entry.text.toString())
        }
    }

    private fun setUpSeekBar(seekBar: SeekBar) {
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                when (i) {
                    in 1..34 -> {setThumb(R.drawable.ic_sentiment_dissatisfied_black_24dp)}
                    in 35..64 -> { setThumb(R.drawable.ic_sentiment_neutral_black_24dp) }
                    in 64..100 -> {setThumb(R.drawable.ic_sentiment_satisfied_black_24dp) }
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) { }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                progress = seekBar.progress
            }
        })
    }

    private fun setThumb(int: Int) {
        seekBar.thumb = ContextCompat.getDrawable(activity!!, int)
    }

}