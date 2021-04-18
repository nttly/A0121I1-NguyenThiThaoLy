var Employee=function () {
    this.getName = function () {
        return this.name;
    }
    this.getCMND =function () {
        return this.cmnd;
    }
    this.getBirthday= function () {
        return this.birthday;
    }
    this.getEmail =function () {
        return this.email;
    }
    this.getPhone=function () {
        return this.phone;
    }
    this.getLevel =function () {
        return this.level;
    }
    this.getLocation =function () {
        return this.location;
    }
    this.getSalary=function () {
        if (this.getLocation()==="Manager"){
            this.salary=500;
        }
        else if (this.getLocation()==="Sale"){
            this.salary=300;
        }
        else if (this.getLocation()==="Makerting"){
            this.salary=200;
        }
        return this.salary;
    }
    this.setName=function (name) {
        this.name=name;
    }
    this.setCmnd=function (cmnd) {
        this.cmnd=cmnd;
    }
    this.setBirthday=function (birthday) {
        this.birthday=birthday;
    }
    this.setPhone=function (phone) {
        this.phone=phone;
    }
    this.setEmail=function (email) {
        this.email=email;
    }
    this.setLevel=function (level) {
        this.level=level;
    }
    this.setLocation=function (location) {
        this.location=location;
    }
    this.setSalary=function (salary) {
        this.salary=salary;
    }

}