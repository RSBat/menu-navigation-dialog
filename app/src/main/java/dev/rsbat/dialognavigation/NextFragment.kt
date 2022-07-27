package dev.rsbat.dialognavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import dev.rsbat.dialognavigation.databinding.FragmentNextBinding


class NextFragment: Fragment() {

    private var _binding: FragmentNextBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNextBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNext
        textView.text = "Next Fragment"
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}