package com.example.wordsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wordsapp.databinding.FragmentLetterListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private lateinit var recyclerView: RecyclerView
private var isLinearLayoutManager = true
private var _binding: FragmentLetterListBinding? = null
private val binding get() = _binding!!

/**
 * A simple [Fragment] subclass.
 * Use the [LetterListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LetterListFragment : Fragment() {
    // Keeps track of which LayoutManager is in use for the [RecyclerView]
    private var isLinearLayoutManager = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)

        recyclerView = binding.recyclerView
        // Sets the LinearLayoutManager of the recyclerview
        chooseLayout()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLetterListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    private lateinit var recyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        chooseLayout()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.layout_menu, menu)

        val layoutButton = menu.findItem(R.id.action_switch_layout)
        setIcon(layoutButton)
    }

    private fun chooseLayout() {
        when (isLinearLayoutManager) {
            true -> {
                com.example.wordsapp.recyclerView.layoutManager = LinearLayoutManager(context)
                com.example.wordsapp.recyclerView.adapter = LetterAdapter()
            }
            false -> {
                com.example.wordsapp.recyclerView.layoutManager = GridLayoutManager(context, 4)
            }
        }
    }
    private fun setIcon(menuItem: MenuItem?) {
        if (menuItem == null)
            return

        menuItem.icon =
            if (isLinearLayoutManager)
                ContextCompat.getDrawable(this.requireContext(), R.drawable.ic_grid_layout)
            else ContextCompat.getDrawable(this.requireContext(),R.drawable.ic_linear_layout)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_switch_layout -> {
                isLinearLayoutManager = !isLinearLayoutManager
                chooseLayout()
                setIcon(item)

                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
//
//    /**
//     * Sets the LayoutManager for the [RecyclerView] based on the desired orientation of the list.
//     */
//    private fun chooseLayout() {
//        if (isLinearLayoutManager) {
//            recyclerView.layoutManager = LinearLayoutManager(this)
//        } else {
//            recyclerView.layoutManager = GridLayoutManager(this, 4)
//        }
//        recyclerView.adapter = LetterAdapter()
//    }
//
//    private fun setIcon(menuItem: MenuItem?) {
//        if (menuItem == null)
//            return
//
//        // Set the drawable for the menu icon based on which LayoutManager is currently in use
//
//        // An if-clause can be used on the right side of an assignment if all paths return a value.
//        // The following code is equivalent to
//        // if (isLinearLayoutManager)
//        //     menu.icon = ContextCompat.getDrawable(this, R.drawable.ic_grid_layout)
//        // else menu.icon = ContextCompat.getDrawable(this, R.drawable.ic_linear_layout)
//        menuItem.icon =
//            if (isLinearLayoutManager)
//                ContextCompat.getDrawable(this, R.drawable.ic_grid_layout)
//            else ContextCompat.getDrawable(this, R.drawable.ic_linear_layout)
//    }
//
//    /**
//     * Initializes the [Menu] to be used with the current [Activity]
//     */

//
//    /**
//     * Determines how to handle interactions with the selected [MenuItem]
//     */
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.action_switch_layout -> {
//                // Sets isLinearLayoutManager (a Boolean) to the opposite value
//                isLinearLayoutManager = !isLinearLayoutManager
//                // Sets layout and icon
//                chooseLayout()
//                setIcon(item)
//
//                return true
//            }
//            //  Otherwise, do nothing and use the core event handling
//
//            // when clauses require that all possible paths be accounted for explicitly,
//            //  for instance both the true and false cases if the value is a Boolean,
//            //  or an else to catch all unhandled cases.
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
}
