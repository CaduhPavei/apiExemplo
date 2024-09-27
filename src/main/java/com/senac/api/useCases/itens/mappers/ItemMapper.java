package com.senac.api.useCases.itens.mappers;

import com.senac.api.model.Item;
import com.senac.api.useCases.itens.domains.ItemRequestDom;
import com.senac.api.useCases.itens.domains.ItemResponseDom;

public class ItemMapper {
    public static Item itemRequestDomToItem(ItemRequestDom input){
        Item output = new Item();
        output.setName(input.getName());
        output.setDescription(input.getDescription());
        output.setPrice(output.getPrice());

        return output;
    }

    public static ItemResponseDom ItemToItemResponseDom(Item input){
        ItemResponseDom output = new ItemResponseDom();
        output.setName(input.getName());
        output.setDescription(output.getDescription());
        output.setPrice(output.getPrice());

        return output;
    }
}
