package fplhn.tiennh21.sd17306.controllers.admin;

import fplhn.tiennh21.sd17306.request.CuaHangVM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cua-hang")
public class CuaHangController {
    @GetMapping("create")
    public String create(Model model)
    {
        CuaHangVM vm = new CuaHangVM();
        vm.setTen("Cua Hang 1");
        vm.setMa("CH0001");
        vm.setDiaChi("HN");
        vm.setQuocGia("VN");

        model.addAttribute("vm", vm);
        return "admin/cua_hang/create";
    }

    @PostMapping("store")
    public String store(Model model)
    {
        return "admin/cua_hang/create";
    }
}
