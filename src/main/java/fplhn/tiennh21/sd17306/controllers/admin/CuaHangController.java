package fplhn.tiennh21.sd17306.controllers.admin;

import fplhn.tiennh21.sd17306.entities.CuaHang;
import fplhn.tiennh21.sd17306.repositories.CuaHangRepository;
import fplhn.tiennh21.sd17306.request.CuaHangVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cua-hang")
public class CuaHangController {
    @Autowired
    @Qualifier("cuaHangVM1")
    private CuaHangVM vm;

    @Autowired
    private CuaHangRepository cuaHangRepo;

    @GetMapping("create")
    public String create(Model model)
    {
        model.addAttribute("vm", vm);
        return "admin/cua_hang/create";
    }

    @PostMapping("store")
    public String store(
        @Valid @ModelAttribute("vm") CuaHangVM vm,
        BindingResult result
    ) {
        if (result.hasErrors()) {
            // Báo lỗi
            System.out.println(vm.getTen());
            return "admin/cua_hang/create";
        } else {
            CuaHang ch = new CuaHang();
            ch.setTen(vm.getTen());
            ch.setMa(vm.getMa());
            ch.setDiaChi(vm.getDiaChi());
            ch.setThanhPho(vm.getThanhPho());
            ch.setQuocGia(vm.getQuocGia());
            this.cuaHangRepo.save(ch);
        }
        return "admin/cua_hang/create";
    }
}
