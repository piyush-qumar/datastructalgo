
exports.createItem=catchAsync(async(req,res,next)=>{
    try{
        const item=await Item.create(req.body);
        res.ststus(201).json({
            status:'success',
            data:{
                item
            }
        })
    }catch(err){
        res.status(400).json({
            status:'fail',
            message:err
        })
    }
    next();
})
exports.getItem=async(req,res,next)=>{
    try{
        const item=await Item.findById(req.params.id);
        res.status(200).json({
            status:'success',
            data:{
                item
            }
        })
    }catch(err){
        res.status(400).json({
            status:'fail',
            message:err
        })
    }
    next();
}
exports.updateItem=async(req,res,next)=>{
    try{
        const item=await Item.findByIdAndUpdate(req.params.id,req.body)
        if(!item)
        res.status(404).json({
            status:'fail',
            message:'No item found'
        })
        res.status(200).json({
            status:'success',
            data:{
                item
            }
        })
    }catch(err){
        res.status(400).json({
            status:'fail',
            message:err
        })
    }
}
exports.deleteItem=async(req,res,next)=>{
    try{
        const item=await Item.findByIdAndDelete(req.params.id);
        if(!item)
        re.status(404).json({
            status:'fail',
            message:'No item found'
        })
        res.status(200).json({
            status:'success',
            data:{
                item
            }
        })
    }catch(err)
    {
        res.status(400).json({
            status:'fail',
            message:err
        })
    }
}