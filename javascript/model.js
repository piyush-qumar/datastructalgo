const mongoose=require('mongoose');
const itemSchema=new mongoose.Schema({
    name:{
        type:String,
        required:[true,'Please enter item name'],
    },
    price:{
        type:Number,
        required:[true,'Please enter item price'],
    },
    description:{
        type:String,
        required:[true,'Please enter item description'],
    },
})
const Item=mongoose.model('Item',itemSchema);
module.exports=Item;