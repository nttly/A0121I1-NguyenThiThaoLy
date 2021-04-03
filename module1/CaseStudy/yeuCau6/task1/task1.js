let Customer = function () {
    this.setName=function (name) {
        this.name=name;
    }
    this.getName = function () {
        return this.name;
    }
    this.setCMND = function () {
        this.cmnd =cmnd;
    }
    this.getCMND =function () {
        return this.cmnd;
    }
    this.setBirthday=function () {
        this.birthday=birthday;
    }
    this.getBirthday= function () {
        return this.birthday;
    }
    this.setEmail =function () {
        this.email=email;
    }
    this.getEmail =function () {
        return this.email;
    }
    this.setAddress=function () {
        this.address=address;
    }
    this.getAddress=function () {
        return this.address;
    }
    this.setTypeCustomer= function () {
        this.typeCustomer =typeCustomer;
    }
    this.getTypeCustomer =function () {
        return this.typeCustomer;
    }
    this.setTypeService=function () {
        this.typeService=typeService;
    }
    this.getTypeService =function () {
        return this.typeService;
    }
    this.setTypeRoom =function () {
        this.typeRoom = typeRoom;
    }
    this.getTypeRoom=function () {
        return this.typeRoom;
    }
    this.setDiscount =function () {
        this.discount=discount;
    }
    this.getDiscount =function () {
        return this.discount;
    }
    this.setQuantityIncluded =function () {
        this.quantityIncluded=quantityIncluded;
    }
    this.getQuantityIncluded = function () {
        return this.quantityIncluded;
    }
    this.setRendDays=function () {
        this.rendDays=rendDays;
    }
    this.getRendDays =function () {
        return this.rendDays;
    }
    this.totalPays= function () {
        let  money=0;
        if (this.getTypeService()==="Vills"){
            money=500;
        }
        else  if (this.getTypeService()==="House"){
            money=300;
        }else  if (this,typeService()==="Room"){
            money=200;
        }
        return this.getRendDays()*money*(1-this.getDiscount()/100);
    }



}