package com.miyazako.groupiedemo

import com.miyazako.groupiedemo.databinding.ItemListBinding
import com.xwray.groupie.databinding.BindableItem

class ListItem(private val text: String): BindableItem<ItemListBinding>() {
    override fun getLayout(): Int = R.layout.item_list

    override fun bind(viewBinding: ItemListBinding, position: Int) {
        viewBinding.text = text
    }
}